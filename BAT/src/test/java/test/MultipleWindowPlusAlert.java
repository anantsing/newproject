package test;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowPlusAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incoginto--");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		
		WebElement windowBtn = driver.findElement(By.xpath("//button[@id='newTabBtn']']"));
		windowBtn.click();
		
		Set<String> allWindowId = driver.getWindowHandles();
		for(String child:allWindowId)
		{
			if(!parentWindowId.equals(child)) {
				driver.switchTo().window(child);
				
				String childTitle = driver.getTitle();
				if(childTitle.contains("AlertsDemo")) {
					WebElement clickMeBtn = driver.findElement(By.xpath("//button[@id='alertBox']"));
					clickMeBtn.click();
					Alert a = driver.switchTo().alert();
							a.accept();
							break;
				}
				
				
				
			}
		}
			
		
		

	}

}
