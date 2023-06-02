package StepDefinations;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Software_Tester {
	
	
	@Given("^I am a good software tester$")
	public void i_am_a_good_software_tester() {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
	   System.out.println("I am a good software tester");
	}
	
	@When("^I go to office$")
	public void i_go_to_office() {
	    System.out.println(" I go to Office");
	}
	
	@And("^i involve in it$")
	public void i_involve_in_it() {

		System.out.println("I involve in it");
	
	}
	
	@Then("^my colleagues appreciate me$")
	public void my_colleagues_appreciate_me() {
	    
		System.out.println("My Colleague appreciate me");
	}
	
	
	@Given("^I am a average software tester$")
	public void I_am_a_average_software_tester() {
	   System.out.println("I am a Average software tester");
	}
	
	@And("^i work in it$")
	public void i_work_in_it() {

		System.out.println("I work in it");
	
	}
	
	@Then("^my colleagues motivate me$")
	public void my_colleagues_motivate_me() {
	    
		System.out.println("my colleagues motivate me");
	}
	
	@Given("^I am a Fresher software tester$")
	public void I_am_a_Fresher_automation_tester() {
	   System.out.println("I am a Fresher automation Tester");
	}

	@And("^i started learning$")
	public void i_started_learning() {

		System.out.println("I started in it");
	
	}
	
	
	@Then("^my colleagues motivate me to learn new Things$")
	public void my_colleagues_motivate_me_to_learn_new_Things() {
	    
		System.out.println("my colleagues motivate me to learn new Things");
	}




}
