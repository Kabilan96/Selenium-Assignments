package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonLeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Button.html");
		
		driver.findElement(By.id("home")).click();
		System.out.println("Title"+driver.getTitle());
		System.out.println("Get url"+driver.getCurrentUrl());
		
		driver.findElement(By.linkText("Button")).click();
		int loc = driver.findElement(By.id("position")).getLocation().getY();
		int loc1 = driver.findElement(By.id("position")).getLocation().getX();
		System.out.println("Position of y :"+loc);
		System.out.println("Position of X :"+loc1);
		
		String cssValue = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("Background color::"+cssValue);
		System.out.println("Height:"+driver.findElement(By.id("size")).getSize().getHeight());
		System.out.println("Width:"+driver.findElement(By.id("size")).getSize().getWidth());
	}

}
