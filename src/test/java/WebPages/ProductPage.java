package WebPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	WebDriver wd;
	
	
	public ProductPage(WebDriver wd) {
		this.wd=wd;
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(xpath="//input[@name='search']")
	WebElement Search;
	@FindBy(xpath="//span[@class='input-group-btn']")
	WebElement SearchButton;
	@FindBy(xpath="//input[@type='checkbox']")
	List<WebElement> Checkbox;
	@FindBy(xpath="//input[@id='button-search']")
	WebElement Searchbutton;
	@FindBy(xpath="//img[@alt='iPhone' and @src='https://naveenautomationlabs.com/opencart/image/cache/catalog/demo/iphone_1-228x228.jpg']")
	WebElement Item;
	@FindBy(xpath="//p[@class='intro']")
	WebElement Review;
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement AddCart;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement Successmsg;
	@FindBy(xpath="//a[@title='Shopping Cart']")
	WebElement ShoppingCart;
	@FindBy(xpath="//table[@class='table table-bordered']")
	List<WebElement> Table;
	
	
	
	public void ProductSearch(String Item) {
		Search.sendKeys(Item);
	}
	public void SearchButton() {
		SearchButton.click();
	}
	public void Checkbox() {
		if(Checkbox.size()>1) {
			WebElement Element = Checkbox.get(1);
			Element.click();
		}
	}
	public void Search() {
		Searchbutton.click();
	}
	public void Item() {
		JavascriptExecutor JS = (JavascriptExecutor)wd;
		JS.executeScript("arguments[0].scrollIntoView(true);", Item);
		Item.click();
	}
	public void Review() {
		JavascriptExecutor JS = (JavascriptExecutor)wd;
		JS.executeScript("arguments[0].scrollIntoView(true);", Review);
		String Msg= Review.getText();
		System.out.println(Msg);
	}
	public void AddToCart() {
		JavascriptExecutor JS = (JavascriptExecutor)wd;
		JS.executeScript("arguments[0].scrollIntoView(true);", AddCart);
		AddCart.click();
	}
	public void SuccessMsg() {
		String Msg=Successmsg.getText();
		System.out.println(Msg);
	}
	public void ShoppingCart() {
		ShoppingCart.click();
	}
	public void Table() {
		if(Table.size()>2) {
			WebElement Element = Table.get(1);
			List<WebElement> Row = Element.findElements(By.tagName("tr"));
			if(Row.size()>1) {
				List<WebElement> Col = Row.get(1).findElements(By.tagName("td"));
				if(Col.size()>5) {
					System.out.println(" the Product is : "+ Col.get(1).getText());
					System.out.println("The Price is : "+ Col.get(4).getText());

				}				
			}
		}
	}
	
	
	
	
	

}
