package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText(  "CRM/SFA")).click();
		
		WebElement leads = driver.findElement(By.xpath( "//a[text()='Leads']"));
		leads.click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("kabilan.ila03@gmail.com");
		WebElement find = driver.findElement(By.xpath( "//button[text()='Find Leads']"));
		find.click();
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath( "//div[@class='x-grid3-hd-inner x-grid3-hd-firstName']/following::tr[1]/td[3]/div/a[1]")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath( "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		driver.findElement(By.className("subMenuButton")).click();
		String dublicate = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		if(dublicate.equals("Duplicate Lead")) {
			System.out.println("dublicate lead is verify");
		}
		else {
			System.out.println("dublicate lead is not verify");
		}
		driver.findElement(By.className("smallSubmit")).click();
		String text2 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text2);
		if(text.equals(text2)) {
			System.out.println("dublicate lead name is same as capture name");
		}
		else {
			System.out.println("not same name");
		}
		Thread.sleep(5000);
		driver.close();
	}

}
