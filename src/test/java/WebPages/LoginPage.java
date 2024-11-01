package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver wd;
	
	
	public LoginPage(WebDriver wd) {
		this.wd=wd;
		PageFactory.initElements(wd, this);
			
	}
	@FindBy(xpath="//a[@title='My Account']")
	WebElement MyAccount;
	@FindBy(xpath="//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/login']")
	WebElement LoginLink;
	@FindBy(id="input-email")
	WebElement Email;
	@FindBy(id="input-password")
	WebElement Password;
	@FindBy(xpath="//input[@type='submit']")
	WebElement LoginButton;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	WebElement ErrorMessage;
	@FindBy(xpath="//a[text()='Logout']")
	WebElement Logout;
	
	
	
	public void MyAccount() throws InterruptedException {
		MyAccount.click();
		Thread.sleep(2000);
	}
	public void LoginLink() throws InterruptedException {
		LoginLink.click();
		Thread.sleep(2000);
	}
	public void Email(String Name) throws InterruptedException {
		Email.sendKeys(Name);
		Thread.sleep(2000);
	}
	public void Password(String password) throws InterruptedException {
		Password.sendKeys(password);
		Thread.sleep(2000);
	}
	public void ErrorMessage() {
		String Msg = ErrorMessage.getText();
		System.out.println(Msg);
	}
	public void LoginButton() {
		LoginButton.click();
	}
	public void Logout() {
		Logout.click();
	}
	
	

}
