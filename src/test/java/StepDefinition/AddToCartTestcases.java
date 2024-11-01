package StepDefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;

import WebPages.LoginPage;
import WebPages.ProductPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class AddToCartTestcases extends BaseClass{
	
	LoginPage LP;
	ProductPage PP;
	
	@Before
	public void Initialize() {
		setup();
		
		
	}
	@Given("Open the Browser AddtoCart")
	public void open_the_browser_addto_cart() {
		wd.get(BaseURL);
		LP = new LoginPage(wd);
		PP = new ProductPage(wd);
	}
	@And("User Enters the Credentiels")
	public void user_enters_the_credentiels() throws InterruptedException, IOException {
		LP.MyAccount();
		screenshot("Scenerio1AddCartMyAccount.png");
		Thread.sleep(3000);
		LP.LoginLink();
		screenshot("Scenerio1AddCartLoginLink.png");
		Thread.sleep(3000);
		LP.Email(Username);
		screenshot("Scenerio1AddCartUsername.png");
		Thread.sleep(3000);
		LP.Password(Password);
		screenshot("Scenerio1AddCartPassword.png");
		Thread.sleep(3000);
		
	}
	@When("Click on LoginButton")
	public void click_on_login_button() throws IOException, InterruptedException {
	    LP.LoginButton();
		screenshot("Scenerio1AddCartLogin.png");
		Thread.sleep(2000);
	    
	}

	@And("User Search for Product")
	public void user_search_for_product() throws IOException, InterruptedException {
	    PP.ProductSearch("Iphone");
		screenshot("Scenerio1AddCartSearch.png");
		Thread.sleep(3000);    
	}
	@When("Click on SearchButton")
	public void click_on_search_button() throws IOException, InterruptedException {
		PP.SearchButton();
		screenshot("Scenerio1AddCart1Searchbutton.png");
		Thread.sleep(3000);
	}
	@And("Click on the Product Description Checkbox")
	public void click_on_the_product_description_checkbox() throws IOException, InterruptedException {
		PP.Checkbox();
		screenshot("Scenerio1AddCartcheckbox.png");
		Thread.sleep(3000);
	    
	}
	@And("Click on Second SearchButton")
	public void click_on_second_search_button() throws IOException, InterruptedException {
		PP.Search();
		screenshot("Scenerio1Addcart2Searchbutton.png");
		Thread.sleep(3000);
	}
	@When("Click on the Item")
	public void click_on_the_item() throws IOException, InterruptedException {
	    PP.Item();
	    screenshot("Scenerio1AddCartItem.png");
		Thread.sleep(3000);
	}
	
	@And("Print the Items Description")
	public void print_the_items_description() throws IOException, InterruptedException {
	    PP.Review();
	    screenshot("Scenerio1AddCartReview.png");
		Thread.sleep(3000);
	}
	

	@Then("Click on AddtoCart")
	public void click_on_addto_cart() throws IOException, InterruptedException {
	    PP.AddToCart();
	    screenshot("Scenerio1AddCartButton.png");
		Thread.sleep(3000);
	}

	@And("Print the Success Message")
	public void print_the_success_message() throws IOException, InterruptedException {
	    PP.SuccessMsg();
	    screenshot("Scenerio1AddCartSuccessMsg.png");
		Thread.sleep(3000);
	    
	}

	@Then("Click on the Cart Icon")
	public void click_on_the_cart_icon() throws IOException, InterruptedException {
	    PP.ShoppingCart();
	    screenshot("Scenerio1AddCartIcon.png");
		Thread.sleep(3000);
	}

	@And("Check the Item is Added Or Not")
	public void check_the_item_is_added_or_not() throws IOException, InterruptedException {
	   PP.Table();
	   screenshot("Scenerio1AddCartData.png");
		Thread.sleep(3000);
	}
	@Then("Click on Logout")
	public void click_on_logout() throws InterruptedException {
		LP.MyAccount();
	    LP.Logout();
	}
	@After
	public void close() {
		teardown();
		
	}


}
