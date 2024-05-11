package ins.aiite.adacitin.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ins.aiite.adacitin.baseclass.BaseClass;

public class LoginPageLocators extends BaseClass{
	
	public LoginPageLocators()
	{
		//to initialize the elements of current web page
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;
	
	public WebElement getUsername()
	{
		return username;
	}

	public WebElement getPassword() 
	{
		return password;
	}

	public WebElement getLogin() 
	{
		return login;
	}
	
	

}
