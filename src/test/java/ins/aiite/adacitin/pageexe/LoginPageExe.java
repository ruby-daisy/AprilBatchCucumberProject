package ins.aiite.adacitin.pageexe;
import ins.aiite.adacitin.locators.BookHotelLocators;
import ins.aiite.adacitin.locators.LoginPageLocators;
public class LoginPageExe extends BookHotelLocators{	
	public static void username()
	{
		sendKeys(new LoginPageLocators().getUsername(), readProperty("username"));
	}	
	public static void password()
	{
		sendKeys(new LoginPageLocators().getPassword(), readProperty("password"));

	}	
	public static void login()
	{		
		click(new LoginPageLocators().getLogin());
	}
	
	public static void username(String user)
	{
		sendKeys(new LoginPageLocators().getUsername(), user);
	}	
	public static void password(String pass)
	{
		sendKeys(new LoginPageLocators().getPassword(), pass);

	}	

	
	
}
