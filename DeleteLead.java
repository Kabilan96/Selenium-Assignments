package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText(  "CRM/SFA")).click();
		
		WebElement leads = driver.findElement(By.xpath( "//a[text()='Leads']"));
		leads.click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		WebElement phonecode = driver.findElement(By.name("phoneCountryCode"));
		phonecode.clear();
		phonecode.sendKeys("91");
		
		driver.findElement(By.name("phoneAreaCode")).sendKeys("044");
		driver.findElement(By.name("phoneNumber")).sendKeys("8940471192");
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(5000);
		String text = driver.findElement(By.className("linktext")).getText();
		System.out.println(text);
		
		 driver.findElement(By.xpath("//td[1]/div[@class='x-grid3-hd-inner x-grid3-hd-partyId']/following::tr[1]/td[1]/div/a[1]")).click();
		 driver.findElement(By.linkText("Delete")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.name("id")).sendKeys("lead ID");
		 driver.findElement(By.xpath( "//button[text()='Find Leads']")).click();
		 WebElement record = driver.findElement(By.xpath( "//div[contains(text(),'No records')]"));
		 boolean record1=record.isDisplayed();
		 if(record1==true) {
			 System.out.println("no record found");
		 }
		 else {
			 System.out.println("recored found");
			 
		 }
		 Thread.sleep(5000);

	

	}

}
