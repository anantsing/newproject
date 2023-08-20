package page;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage extends helper.Base {
	WebDriver driver; 
	
	
	public void user_launch_site_url() {
	      setup();
	   
	}


	public void enter_correct_username_and_password(String usernam, String passwor) {
		System.out.println("sdfghjhfdsdfgh");
	WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
	       username.sendKeys(usernam);
	 WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
            password.sendKeys(passwor); 
            System.out.println("Usaer Name : "+username);
            System.out.println("User Pasword : "+password);
            //WebElement country = driver.findElement(By.xpath(""));  
           // selectDropDownByText(country, "india");
         //   WebElement state = driver.findElement(By.xpath(""));
          // selectDropDownByText(state, "up");
         //  mouseMover(country);
         //  selectDropdownByIndex(state, 1);
           
            
	
	
	}
	       
	
	
	
	

	public void click_on_login_button() {
		WebElement loginbtn = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginbtn.click();
	}

	
	public void validate_is_succesful() {
		assertTrue(driver.findElement(By.xpath("")).isDisplayed());
		
		
	    
	}



}
