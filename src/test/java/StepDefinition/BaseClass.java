package StepDefinition;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import Utilities.ReadConfig;
import io.cucumber.java.Before;

import org.apache.commons.io.FileUtils;




public class BaseClass {
	
	static ReadConfig Read = new ReadConfig();
	
	public static  WebDriver wd;
	public static String BaseURL =Read.GetApplicationURl();
	public String Username=Read.GetUsernName();
	public String Password=Read.GetPassword();
	
	
	public  static void setup() {
		if(wd==null) {
			System.setProperty("webdriver.chrome.driver", Read.GetChromeDriver());
			wd= new ChromeDriver();
			wd.manage().window().maximize();
            wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }	
		
	}
	
	public void screenshot(String Name) throws IOException {
		TakesScreenshot src= (TakesScreenshot)wd;
		File Source=src.getScreenshotAs(OutputType.FILE);
		String path ="C:\\Users\\akhil\\eclipse-workspace\\CucumberFrameWork\\ScreenShots";
		File Destination=new File(path+"\\"+Name);
		FileUtils.copyFile(Source,Destination);
	}
	public void teardown() {
		if (wd!=null) {
			wd.close();
			wd.quit();
			wd=null;
			
		}
		
		
	}
	

}
