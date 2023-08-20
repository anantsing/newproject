package test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito--");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		WebElement heading = driver.findElement(By.xpath("//div[@class='login_logo']"));
		String headingText = heading.getText();
		assertEquals("Swa Labs", headingText);
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();

	}

	private static void assertEquals(String string, String headingText) {
		// TODO Auto-generated method stub
		
	}

	
		
	}


