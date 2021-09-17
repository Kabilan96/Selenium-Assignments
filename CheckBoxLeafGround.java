package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxLeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/checkbox.html");
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();

		boolean enable = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isEnabled();
		if (enable == true) {
			System.out.println("CheckBox is enabled");
		} else
			System.out.println("CheckBox Not enabled");
		
		boolean deselect1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).isEnabled();
		if (deselect1 == false) {
			System.out.println("Deselected:" + deselect1);
		} else {
			System.out.println("Deselected:" + deselect1);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
		}
		driver.findElement(By.xpath("(//div[@class='example'])[4]//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("((//div[@class='example'])[4]//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("((//div[@class='example'])[4]//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("((//div[@class='example'])[4]//input[@type='checkbox'])[4]")).click();
		driver.findElement(By.xpath("((//div[@class='example'])[4]//input[@type='checkbox'])[5]")).click();

		}
	}


