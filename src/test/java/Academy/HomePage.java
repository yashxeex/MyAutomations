package Academy;

import org.testng.annotations.Test;


import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	
	public static Logger log =LogManager.getLogger(base.class.getName());
	public WebDriver driver;
	
@BeforeTest 
public void initialize() throws IOException { 
	driver=initializeDriver();
	log.info("Driver initialized");
	
}


//DataProvider - Developer Branch Code
//Yash is working on this test
@Test(dataProvider="getData")
public void basePageNavigation(String username, String password) throws IOException { 
	 
	driver.get("http://www.qaclickacademy.com/");
	LandingPage L=new LandingPage(driver);
	L.getLogin().click();
	
	LoginPage lp=new LoginPage(driver);
	lp.getEmail().sendKeys(username);
	lp.getPassword().sendKeys(password);
	
	log.info("Yash and Prashant details entered");
	
	lp.getLogin().click();
	
	

	}

@AfterTest
public void tearDown() { 
	driver.close();
	
}

@DataProvider
public Object[][] getData() { 
	Object[][] data = new Object[2][2];
	
	data[0][0]="yash@gmail.com";
	data[0][1]="12345";

    data[1][0]="prashant@gmail.com";
	data[1][1]="123456789";   
	
	return data;
	
}


}
