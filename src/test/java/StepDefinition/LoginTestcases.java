package StepDefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import WebPages.LoginPage;
import WebPages.ProductPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginTestcases extends BaseClass{
	LoginPage LP;
    
	@Before
    public void initialize() {
		setup();
        
    }
	@Given("Open the Browser")
	public void open_the_browser() {
		wd.get(BaseURL);
        LP = new LoginPage(wd);
	}

	@And("User Enter the Credentiels")
	public void user_enter_the_credentiels() throws InterruptedException, IOException {
		LP.MyAccount();
		screenshot("Scenerio1MyAccount.png");
		Thread.sleep(3000);
		LP.LoginLink();
		screenshot("Scenerio1LoginLink.png");
		Thread.sleep(3000);
		LP.Email(Username);
		screenshot("Scenerio1Username.png");
		Thread.sleep(3000);
		LP.Password(Password);
		screenshot("Scenerio1Password.png");
		Thread.sleep(3000);
		
		
	    
	}
	
	@And("User Enter the Invalid UserName")
	public void user_enter_the_invalid_user_name() throws InterruptedException, IOException {
		LP.MyAccount();
		screenshot("Scenerio2MyAccount.png");
		Thread.sleep(3000);
		LP.LoginLink();
		screenshot("Scenerio2LoginLink.png");
		Thread.sleep(3000);
		LP.Email("akhilparappurrr@gmail.com");
		screenshot("Scenerio2Username.png");
		Thread.sleep(3000);
		LP.Password("A1aB2bC3c");
		screenshot("Scenerio2Password.png");
		Thread.sleep(3000);
	    
	}
	
	@And("User Enter the Invalid Password")
	public void user_enter_the_invalid_password() throws InterruptedException, IOException {
		LP.MyAccount();
		screenshot("Scenerio3MyAccount.png");
		Thread.sleep(3000);
		LP.LoginLink();
		screenshot("Scenerio3LoginLink.png");
		Thread.sleep(3000);
		LP.Email("akhilparappur@gmail.com");
		screenshot("Scenerio3Username.png");
		Thread.sleep(3000);
		LP.Password("A1aB2bC3cddd");
		screenshot("Scenerio3Password.png");
		Thread.sleep(3000);
	}
	
	@And("User Enters only Password and Username Empty")
	public void user_enters_only_password_and_username_empty() throws InterruptedException, IOException {
		LP.MyAccount();
		screenshot("Scenerio4MyAccount.png");
		Thread.sleep(3000);
		LP.LoginLink();
		screenshot("Scenerio4LoginLink.png");
		Thread.sleep(3000);
		LP.Email("");
		screenshot("Scenerio4Username.png");
		Thread.sleep(3000);
		LP.Password("A1aB2bC3c");
		screenshot("Scenerio4Password.png");
		Thread.sleep(3000);

	    
	}

	@And("User Enter Only UserName")
	public void user_enter_only_user_name() throws InterruptedException, IOException {
		LP.MyAccount();
		screenshot("Scenerio5MyAccount.png");
		Thread.sleep(3000);
		LP.LoginLink();
		screenshot("Scenerio5LoginLink.png");
		Thread.sleep(3000);
		LP.Email("akhilparappur@gmail.com");
		screenshot("Scenerio5Username.png");
		Thread.sleep(3000);
		LP.Password("");
		screenshot("Scenerio5Password.png");
		Thread.sleep(3000);
	    
	}

	@When("Click on the LoginButton")
	public void click_on_the_login_button() throws IOException, InterruptedException {
		LP.LoginButton();
		screenshot("LoginButton.png");
		Thread.sleep(3000);
	    
	}

	@Then("User Enters to HomePage")
	public void user_enters_to_home_page() throws InterruptedException, IOException {
		LP.MyAccount();
		LP.Logout();
		screenshot("Logout.png");
		Thread.sleep(3000);
	   
	}

	@Then("User Gets an UserName Error Message")
	public void user_gets_an_user_name_error_message() throws IOException, InterruptedException {
		LP.ErrorMessage();
		screenshot("UsernameError.png");
		Thread.sleep(3000);
	    
	}

	@Then("User Gets an Password Error Message")
	public void user_gets_an_password_error_message() throws IOException, InterruptedException {
		LP.ErrorMessage();
		screenshot("PasswordError.png");
		Thread.sleep(3000);
	}
	
	@After
	public void closebrowser() {
		teardown();
	}
	


}
