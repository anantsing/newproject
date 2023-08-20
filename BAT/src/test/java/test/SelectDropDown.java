package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("---incoginto---");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='course']"));
		Select s = new Select(dropDown);
		s.selectByVisibleText("Javascript");
		s.selectByIndex(0);
		s.selectByValue("net");
	}

}
