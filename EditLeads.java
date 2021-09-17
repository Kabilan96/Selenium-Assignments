package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
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
			driver.findElement(By.xpath( "(//input[@name='firstName'])[3]")).sendKeys("kabilan");
		    driver.findElement(By.xpath( "//button[text()='Find Leads']")).click();
		    Thread.sleep(5000);
		   
		    
		    String text = driver.findElement(By.xpath( " //div[@class='x-grid3-hd-inner x-grid3-hd-firstName']/following::tr[1]/td[3]/div/a[1]")).getText();
		    System.out.println(text);
		    driver.findElement(By.xpath( "//div[@class='x-grid3-hd-inner x-grid3-hd-firstName']/following::tr[1]/td[3]/div/a[1]")).click();
		   String title = driver.findElement(By.xpath( "//div[text()='View Lead']")).getText();
		   if(title.equals("View Lead")) {
			   System.out.println("title of the page");
			   
		   }
		   else {
			   System.out.println("not same title");
		   }
		   Thread.sleep(5000);
			   driver.findElement(By.xpath( "//a[text()='Edit']")).click();
			   driver.findElement(By.xpath("//input[@class='inputBox'][1]")).clear();
			   driver.findElement(By.xpath("//input[@class='inputBox'][1]")).sendKeys("CTS");
			   driver.findElement(By.xpath( "//input[@class='smallSubmit'][1]")).click();
			   String text2 = driver.findElement(By.xpath( "//span[@id='viewLead_companyName_sp']")).getText();
			   System.out.println(text2);
			   if(text2.contains("TCS (10676)")) {
				   System.out.println("companyname edited");
				   
			   }
			   else {
				   System.out.println("not contains");
				   
			   }
			   driver.close();
	}

}
