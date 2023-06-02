package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	
	
	@Given("^I visit the website as a guest user$")
	public void I_visit_the_website_as_a_guest_user() 
	{	
		
		System.out.println("You are Welcome....!!!!");
	}
	
	
	@When("^I select the books option from dropdown$")
	public void I_select_the_books_option_from_dropdown()
	{
		System.out.println("You Selected the books option from Dropdown....!!!");
	}

	
	@And("^I click on search option$")
	public void I_click_on_search_option()
	{
		System.out.println("You Clicked on Search option....!!!");
	}
	
	
	@Then("^I should be abel to see books page loaded$")
	public void I_should_be_abel_to_see_books_page_loaded ()
	{
		System.out.println("Books page is loaded.....!!");
	}
	
	
	@And("^I should see Books at Amazon as heading$")
	public void I_should_see_Books_at_Amazon_as_heading()
	{
		System.out.println("You are able to see the books on Amazon as Heading ....!!");
	}
	
	
	@But("^I should not see the products from other categories$")
	 public void I_should_not_see_the_products_from_other_categories()
	 {
		 System.out.println("You are not viewing any other product apart from the books...!!");
	 }
	
	@Given("^I visit the website as a guest user1$")
	public void I_visit_the_website_as_a_guest_user1() 
	{	
		
		System.out.println("You are Welcome....!!!!");
	}
	
	@When("^I select the Baby option from dropdown$")
	public void I_select_the_Baby_option_from_dropdown()
	{
		//int i=10/0;
		System.out.println("You Select the baby option from dropdown...!!!");
	}
	
	@And("^I click on search option1$")
	public void I_click_on_search_option1()
	{
		System.out.println("You Clicked on Search option....!!!");
	}
	
	
	
	@Then("^I should be abel to see Baby page loaded$")
	public void I_should_be_abel_to_see_Baby_page_loaded ()
	{
		System.out.println("Baby page is loaded....!!!.....!!");
		int i=10/0;
	}
	
	@And("^I should see The baby Store  at Amazon as heading$")
	public void I_should_see_The_baby_Store_at_Amazon_as_heading()
	{
		System.out.println("You are viewing Baby page as a heading....!!! ....!!");
	}
}
