package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("kabian.ila03@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).sendKeys(Keys.TAB);
		WebElement findElement = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[3]/input"));
		String text = findElement.getAttribute("value");
		System.out.println(text);
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();
		boolean enabled=driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled();
		if(enabled==true)
			System.out.println("Enabled");
		else
			System.out.println("Not Enabled");
		
	}

}
