package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incoginto--");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		WebElement productIcon = driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));
		Actions a = new Actions(driver);
		a.moveToElement(productIcon).build().perform();
		
		WebElement liveMenu = driver.findElement(By.xpath("//a[@class='menu-item-live']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));//max time
		wait.until(ExpectedConditions.visibilityOf(liveMenu));
		liveMenu.click();
		
		
	}

}
