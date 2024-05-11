package ins.aiite.projexe;




import org.junit.*;

import ins.aiite.adacitin.pageexe.BookHotelExe;

public class AdacitinHotelExe extends BookHotelExe{
	
	@BeforeClass
	public static void beforeClassMethod()
	{
		browser();
		winMax();
		getUrl(readProperty("url"));		
	}
	
	@AfterClass
	public static void afterClassMethod()
	{

		driver.close();
	}
	


@Test
public void Test1() throws InterruptedException
{
	username();
}

@Test
public void Test2() throws InterruptedException
{
	password();
}

@Test
public void Test3() throws InterruptedException
{
	login();
	//ValidateLogin();
}





	@Test @Ignore
	public void testSydney() throws InterruptedException
	{
		
		Location("Sydney");
		Hotels();
		RoomType();
		Noofrooms();
		Checkin();
		Checkout();
		Adultroom();
		Childroom();
		search();
		
	}
	
	@Test @Ignore
	public void testSelectHotel() throws InterruptedException
	{	
		radiobtn();
		continuebtn();
		
}
	
	@Test @Ignore
	public void testBookHotel() throws InterruptedException
	{
		FirstName();
		LastName();
		address();
		CreditCardNum();
		CreditCardType();
		ccExpMonth();
		ccExpYear();
		cvv();
		booknow();
		
		orderno();
		
	}
	
	
	
	@Test @Ignore
	public void testLondon() throws InterruptedException
	{
		
		Location("London");
		Hotels();
		RoomType();
		Noofrooms();
		Checkin();
		Checkout();
		Adultroom();
		Childroom();
		search();
		
		radiobtn();
		continuebtn();
		
		FirstName();
		LastName();
		address();
		CreditCardNum();
		CreditCardType();
		ccExpMonth();
		ccExpYear();
		cvv();
		booknow();
		
		orderno();		
	}
}
