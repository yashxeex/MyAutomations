package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
WebDriver driver;	
	
By email = By.cssSelector("input#user_email");
By password = By.cssSelector("input[type='password']");
By Login = By.xpath("//input[@value='Log In']");


public WebElement getEmail() { 
	
	return driver.findElement(email);
}


public WebElement getPassword() { 
	
	return driver.findElement(password);
}

public WebElement getLogin() { 
	
	return driver.findElement(Login);
}



public LoginPage(WebDriver driver) { 
	this.driver=driver;
}

	
}
