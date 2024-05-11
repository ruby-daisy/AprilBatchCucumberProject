package ins.aiite.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import ins.aiite.adacitin.pageexe.BookHotelExe;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTableMethods extends BookHotelExe{
	
	
	@When("User enters form for asList")
	public void user_enters_form_for_as_list(io.cucumber.datatable.DataTable dataTable) throws InterruptedException 
	{
		List<String> asList = dataTable.asList();
		System.out.println(asList.get(0));
		System.out.println(asList.get(1));
		
		
	}

	

	@When("User enters form for asLists")
	public void user_enters_form_for_as_lists(io.cucumber.datatable.DataTable dataTable) {
		
		List<List<String>> asLists = dataTable.asLists();
		System.out.println(asLists.get(1).get(1));
	}

	
	@Given("Launch the given browser")
	public void launch_the_given_browser() {
		Assert.assertTrue(true);
	    
	}
	@Given("User enters the given URL")
	public void user_enters_the_given_url() {
		Assert.assertTrue(true);
	}
	
	
	@When("User enters form for asMap")
	public void user_enters_form_for_as_map(io.cucumber.datatable.DataTable dataTable) {
		
		Map<String, String> asMap = dataTable.asMap();
		System.out.println(asMap.get("email"));
	}


	
	@When("User enters form for asMaps")
	public void user_enters_form_for_as_maps(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String, String>> asMaps = dataTable.asMaps();
		System.out.println(asMaps.get(0).get("Lastname"));
		
	}






}
