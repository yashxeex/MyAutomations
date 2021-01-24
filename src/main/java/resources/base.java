package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException { 
		
		
	    prop=new Properties(); 
		
		FileInputStream fis= new FileInputStream("/Users/yashrajpal/eclipse-workspace-yashr/E2EProject/src/main/java/data.properties");
		prop.load(fis);
		
		//String browserName=prop.getProperty("browser"); use mvn test -Dbrowser=chrome 
		String browserName=System.getProperty("browser");
		
		if(browserName.equals("chrome")) { 
			
			System.setProperty("webdriver.chrome.driver", "//Users//yashrajpal//Desktop//chromedriver");
			
			driver=new ChromeDriver();
			
			
		}
		
		else if (browserName=="firefox") { 
			
			//firefox code
		}
		
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		
	return driver;	
	}
	
	
public void getScreenshotPath(String testCaseName, WebDriver driver) throws IOException { 
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	
	String destFile = System.getProperty("user.dir")+ File.separator + "reports" + File.separator + testCaseName+".png";
	
	try {
		FileUtils.copyFile(source,new File(destFile));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
	
	

}
