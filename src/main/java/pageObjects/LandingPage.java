package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
WebDriver driver;	

public LandingPage(WebDriver driver) { 
	this.driver=driver;
}

	
By Login = By.cssSelector("a[href*='sign_in']");
By title = By.xpath("//div[@class='text-center']/h2");
By navigationBar = By.cssSelector("ul.nav.navbar-nav.navbar-right");


public WebElement getLogin() { 
	
	return driver.findElement(Login);
}


public WebElement getTitle() { 
	
	return driver.findElement(title);
}

public WebElement getNavBar() { 
	
	return driver.findElement(navigationBar);
}



	
}
