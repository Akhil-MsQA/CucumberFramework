package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties Pro;
	public ReadConfig()  {
		File file = new File("./Configuration\\Config.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			Pro = new Properties();
			Pro.load(fis);	
		}catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
			
		}
	
	
	public String GetApplicationURl() {
		String URL = Pro.getProperty("BaseURL");
		return URL;
	}
	public String GetUsernName() {
		String Username=Pro.getProperty("UserName");
		return Username;
	}
	public String GetPassword() {
		String Password=Pro.getProperty("Password");
		return Password;
	}
	public String GetChromeDriver() {
		String chromedriver=Pro.getProperty("ChromeDriver");
		return chromedriver;
	}
	public String GetMsedgeDriver() {
		String msedgedriver=Pro.getProperty("EdgeDriver");
		return msedgedriver;

}
}
