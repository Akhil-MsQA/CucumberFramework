package StepDefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Parameters;

import WebPages.LoginPage;
import WebPages.ProductPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class GuestUserAddToCart extends BaseClass {
	
	LoginPage LP;
	ProductPage PP;
	
	@Before
    public void initialize() {
        setup();
    }
	
	@Given("Open the Browser for GuestUser")
	public void open_the_browser_for_guest_user() {
		wd.get(BaseURL);
		LP = new LoginPage(wd);
        PP = new ProductPage(wd);
	}

	@And("Search for a Product")
	public void search_for_a_product() throws IOException, InterruptedException {
	    PP.ProductSearch("Iphone");
	    screenshot("GuestUserAddtoCartProduct.png");
	    Thread.sleep(3000);
	}

	@When("Click on the SearchButton")
	public void click_on_the_search_button() throws IOException, InterruptedException {
	    PP.SearchButton();
	    screenshot("GuestUserAddToCartSearchButton.png");
	    Thread.sleep(3000);
	}

	@Then("click on the Checkbox")
	public void click_on_the_checkbox() throws IOException, InterruptedException {
	    PP.Checkbox();
	    screenshot("GuestUserAddToCartCheckBox.png");
	    Thread.sleep(3000);
	}

	@And("Again click on the Second SearchButton")
	public void again_click_on_the_second_search_button() throws IOException, InterruptedException {
	    PP.Search();
	    screenshot("GuestUserAddToCartSecondSearch.png");
	    Thread.sleep(3000);
	}
	@And("Click on the Product Item")
	public void click_on_the_product_item() throws IOException, InterruptedException {
	    PP.Item();
	    screenshot("GuestUserAddToCartItem.png");
	    Thread.sleep(3000);
	    
	}

	@Then("click on the AddToCart")
	public void click_on_the_add_to_cart() throws IOException, InterruptedException {
	    PP.AddToCart();
	    screenshot("GuestUserAddToCart.png");
	    Thread.sleep(3000);
	}
	@And("Print the Guest Success Message")
	public void print_the_guest_success_message() throws IOException, InterruptedException {
		PP.SuccessMsg();
		screenshot("GuestUserAddtoCartSuccessMsg.png");
		Thread.sleep(3000);
	}

	@When("Click on the Shopping Cart")
	public void click_on_the_shopping_cart() throws IOException, InterruptedException {
	    PP.ShoppingCart();
	    screenshot("GuestUserAddToCartIcon.png");
	    Thread.sleep(3000);
	    
	}

	@And("Check the Product is Added")
	public void check_the_product_is_added() throws IOException, InterruptedException {
	    PP.Table();
	    screenshot("GuestUserAddToCartData.png");
	    Thread.sleep(3000);
	}

	@Then("Close the Browser")
	public void close_the_browser() {
	    System.out.println("Checked");
	}
	
	@After
	public void close() {
		teardown();
	}


}
