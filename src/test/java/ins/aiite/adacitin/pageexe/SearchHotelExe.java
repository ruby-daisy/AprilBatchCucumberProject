package ins.aiite.adacitin.pageexe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import ins.aiite.adacitin.locators.LoginPageLocators;
import ins.aiite.adacitin.locators.SearchHotelLocators;

public class SearchHotelExe extends LoginPageExe{
	public static void Location(String cityName) throws InterruptedException{
		WebElement location=click(findElementBy(SearchHotelLocators.Locations));
		Select select=new Select(location);
		select.selectByVisibleText(cityName);
		Thread.sleep(1000);
	}	
	
	public static void Hotels() throws InterruptedException {
		WebElement Hotel=click(findElementBy(SearchHotelLocators.Hotels));
		Select select=new Select(Hotel);
		select.selectByIndex(1);
		Thread.sleep(1000);
		
	}
public static void RoomType() throws InterruptedException {
	WebElement RoomType=click(findElementBy(SearchHotelLocators.RoomType));
	Select select=new Select(RoomType);
	select.selectByIndex(3);
	Thread.sleep(1000);
	}
public static void Noofrooms() throws InterruptedException {
	WebElement Noofrooms=click(findElementBy(SearchHotelLocators.Noofrooms));
	Select select=new Select(Noofrooms);
	select.selectByIndex(1);
	Thread.sleep(1000);
}
public static void Checkin() throws InterruptedException {
	WebElement Checkin=click(findElementBy(SearchHotelLocators.Checkin));
	Checkin.clear();
	Thread.sleep(1000);
	//Clear(findElementBy(SearchHotelLocators.Checkin));
	sendKeys(findElementBy(SearchHotelLocators.Checkin),excelReuse(1,3));
	Thread.sleep(1000);
	
}
public static void Checkout() throws InterruptedException{
//	driver.findElement(SearchHotelLocators.Checkout).clear();
//	Thread.sleep(1000);
	WebElement Checkout=click(findElementBy(SearchHotelLocators.Checkout));
	Checkout.clear();
	Thread.sleep(1000);

	sendKeys(findElementBy(SearchHotelLocators.Checkout),excelReuse(1,4));
	Thread.sleep(1000);
	
}
public static void Adultroom() throws InterruptedException {
	
	WebElement Adultroom=click(findElementBy(SearchHotelLocators.Adultroom));
	Select select=new Select(Adultroom);
	select.selectByIndex(1);
	Thread.sleep(1000);
	
}
public static void Childroom() throws InterruptedException{
	WebElement Childroom=click(findElementBy(SearchHotelLocators.Childroom));
	Select select=new Select(Childroom);
	select.selectByIndex(1);
	Thread.sleep(1000);
}
public static void search(){
	
	click(findElementBy(SearchHotelLocators.search));
	}
	


}
