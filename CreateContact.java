package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("  http://leaftaps.com/opentaps/control/login ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText(  "CRM/SFA")).click();
		  
		  driver.findElement(By.linkText("Create Lead")).click();
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("VERTEX");
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kabilan");
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		  WebElement dropdown4 = driver.findElement(By.name("dataSourceId"));
		  Select drop3 = new Select (dropdown4);
		  drop3.selectByVisibleText("Employee");
		  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kabilan");
		  driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("R");
		  driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("mr");
		  driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("12/03/1996");
		  driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("job");
		  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("software");
		  driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("350000");
		  driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("65");
		  driver.findElement(By.name("description")).sendKeys("Study Selenium");
		  WebElement countrycode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		  countrycode.clear();
		  countrycode.sendKeys("91");
		  driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("0");
		  driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8940471192");
		  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kabilan.ila03@gmail.com");
		  WebElement dropdown1 = driver.findElement(By.name("generalCountryGeoId"));
		  Select drop2 =new  Select (dropdown1);
		  drop2.selectByVisibleText("India");
		  WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		  Select drop1 = new Select(dropdown);
		  drop1.selectByVisibleText("TAMILNADU");
		  driver.findElement(By.className("smallSubmit")).click();
		  driver.findElement(By.className("subMenuButton")).click();
		  driver.findElement(By.name("description")).clear();
		  driver.findElement(By.name("importantNote")).sendKeys("Selenium Java");
		  
		  String title = driver.getTitle();
		  System.out.println("title of the page:" +title );
	}

}
