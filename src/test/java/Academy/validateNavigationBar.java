package Academy;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.io.IOException;
import pageObjects.LandingPage;
import resources.base;

public class validateNavigationBar extends base {

	public static Logger log =LogManager.getLogger(base.class.getName());
	public WebDriver driver;

	@BeforeTest 
	public void initialize() throws IOException { 
		driver=initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
	}	
	
@Test
public void basePageNavigation() throws IOException { 
	 
	LandingPage L=new LandingPage(driver);
	Assert.assertTrue(L.getNavBar().isDisplayed());
	
	
	
	}

@AfterTest
public void tearDown() { 
	driver.close();
	
}


}
