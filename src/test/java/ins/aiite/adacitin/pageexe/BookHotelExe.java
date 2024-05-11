package ins.aiite.adacitin.pageexe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import ins.aiite.adacitin.baseclass.BaseClass;
import ins.aiite.adacitin.locators.BookHotelLocators;
import ins.aiite.adacitin.locators.SearchHotelLocators;

public class BookHotelExe extends SelectHotelExe{
	
	public static void FirstName() throws InterruptedException {
		sendKeys(findElementBy(BookHotelLocators.firstName),excelReuse(1,5));
		Thread.sleep(1000);
		
	}
	public static void LastName() throws InterruptedException {
		sendKeys(findElementBy(BookHotelLocators.lastName),excelReuse(1,6));
		Thread.sleep(1000);
		
	}
	public static void address() throws InterruptedException {
		sendKeys(findElementBy(BookHotelLocators.address),excelReuse(1,7));
		Thread.sleep(1000);
		
	}
	public static void CreditCardNum() throws InterruptedException {
		sendKeys(findElementBy(BookHotelLocators.ccNum),excelReuse(1,8));
		Thread.sleep(1000);
		
	}
	public static void CreditCardType() throws InterruptedException {
		WebElement ccnum=click(findElementBy(BookHotelLocators.ccType));
		Select select=new Select(ccnum);
		select.selectByIndex(2);
		Thread.sleep(1000);
		}
	public static void ccExpMonth() throws InterruptedException {
		WebElement month=click(findElementBy(BookHotelLocators.ccExpMonth));
		Select select=new Select(month);
		select.selectByIndex(2);
		Thread.sleep(1000);
	}
	public static void ccExpYear () throws InterruptedException {
		WebElement year=click(findElementBy(BookHotelLocators.ccExpYear));
		Select select=new Select(year);
		select.selectByIndex(17);
		Thread.sleep(1000);
	}
	public static void cvv() throws InterruptedException {
		sendKeys(findElementBy(BookHotelLocators.cvv),excelReuse(1,9));
		Thread.sleep(1000);
		
	}
	public static void booknow() throws InterruptedException  {
		click(findElementBy(BookHotelLocators.booknow));
		Thread.sleep(5000);
		}
	
	public static void orderno()  {
		String attri=getAttribute(findElementBy(BookHotelLocators.orderno),"value");
		//String attribute=BaseClass.findElementBy(BookHotelLocators.orderno).getAttribute("value");
		System.out.println(attri);
		
		}
	

}
