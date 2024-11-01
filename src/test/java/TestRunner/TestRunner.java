package TestRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import StepDefinition.BaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@Test
@CucumberOptions(features={"C:\\Users\\akhil\\eclipse-workspace\\CucumberFrameWork\\src\\test\\resources\\Features\\Login.feature",
"C:\\Users\\akhil\\eclipse-workspace\\CucumberFrameWork\\src\\test\\resources\\Features\\ValidUserAddProductToCart.feature",
"C:\\Users\\akhil\\eclipse-workspace\\CucumberFrameWork\\src\\test\\resources\\Features\\GuestUserAddProductToCart.feature"},
glue= {"StepDefinition"},
plugin = {"pretty", "html:target/HTMLReports.html", "json:target/cucumber.json", "junit:target/cucumber.xml"}, //report generataion
monochrome = true)  // Cleaner console output))
public class TestRunner extends AbstractTestNGCucumberTests{
	
	
    
	}

    

