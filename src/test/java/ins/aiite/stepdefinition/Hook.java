package ins.aiite.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

	@Before
	public void before()
	{
		System.out.println("BeforeClass");
	}
	
	@After
	public void after()
	{
		System.out.println("AfterClass");
	}
}
