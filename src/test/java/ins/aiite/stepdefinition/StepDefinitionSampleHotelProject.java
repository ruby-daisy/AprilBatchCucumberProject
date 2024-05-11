package ins.aiite.stepdefinition;

import org.junit.Assert;

import ins.aiite.adacitin.pageexe.BookHotelExe;
import io.cucumber.java.en.*;

public class StepDefinitionSampleHotelProject extends BookHotelExe{
	

@Given("Launch browser")
public void launch_browser() {

	browser();
	winMax();
}

@Given("User enters the URL {string}")
public void user_enters_the_url(String url) {

	getUrl(url);	
}

@When("User enters username {string}")
public void user_enters_username(String u) {
username(u);
}

@When("user enters password {string}")
public void user_enters_password(String p) {
	password(p);
    
}

@When("clicks login button")
public void clicks_login_button() {
   login();
   driver.quit();
}

@Then("validate the home page")
public void validate_the_home_page() {
   
}

@Then("validate the user icon")
public void validate_the_user_icon() {
   System.out.println("validate the user icon");
}

@Then("signin icon is not enabled")
public void signin_icon_is_not_enabled() {
    System.out.println("signin icon is not enabled");
    
    
}

@When("User enters username {string} and password {string}")
public void user_enters_username_and_password(String user, String pass) {
	username(user);
	password(pass);
	Assert.assertTrue(false);
    
}

@Given("Launch the chrome browser {string}")
public void launch_the_chrome_browser(String c) {
	browserSelect(c);
}

@Given("Launch the edge browser {string}")
public void launch_the_edge_browser(String e) {
	browserSelect(e);
}

@Given("Launch the browser {string}")
public void launch_the_browser(String bName) {
	browserSelect(bName);
}

}
