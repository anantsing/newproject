package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptPopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incoginto--");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		WebElement clickmeBtn = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		clickmeBtn.click();
		
		Alert a = driver.switchTo().alert();
		a.sendKeys("singh");
		String alertText = a.getText();
		System.out.println(alertText);
		try {
			Thread.sleep(2400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		a.accept();
		
		
		

	}

}
