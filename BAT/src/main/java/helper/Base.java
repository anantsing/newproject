package helper;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
       
public WebDriver driver;
	
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--incognito");
		driver = new ChromeDriver(option);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
		
	public void selectDropDownByText(WebElement ele, String value) {
		
		Select s = new Select(ele);
		s.selectByVisibleText(value);
		}
	
	public void mouseMover(WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).build().perform();
	
		
	}
	
	
	public void selectDropdownByIndex(WebElement ele,int value) {
		Select s = new Select(ele);
		s.selectByIndex(value);
		
	}
	
	public void selectAlertPopup() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
				
		
		
	
}


