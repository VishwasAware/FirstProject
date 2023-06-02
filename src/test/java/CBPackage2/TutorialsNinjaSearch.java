package CBPackage2;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TutorialsNinjaSearch {
	
	WebDriver driver=new ChromeDriver();
	
	@Given("^I visit to the TutorialsNinja Website$")
	public void I_visit_to_the_TutorialsNinja_Websitee() 
	{
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
					
	} 

	
	@When("^I enter the username as and password as fields$")
	public void I_enter_the_username_as_and_password_as_fields()

	{
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
//		driver.findElement(By.name("email")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("email")).sendKeys("abcg@gmail.com");
		driver.findElement(By.name("password")).sendKeys("1234567890");
		
	}
	
	
	
	@And("^I clicked on login$")
	public void I_clicked_on_login()
	
	{
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	}
	
	
	
	@Then("^user should login$")
	public void user_should_login()

	{ 
		
		
		String actualloginstatus=null;
		try {
		Alert alert=	driver.switchTo().alert();
		String str=alert.getText();
		System.out.println(str);
		
		if(str.equals("No match for E-Mail Address and/or Password."))
		{
			actualloginstatus="Fail";
			System.out.println("Logged in Failed......");
			
		}
		}
		
	catch(Exception e)
		{
		actualloginstatus="Successfully logged in";
		
		}
		
//		if(actualloginstatus.equals(loginstatus))
//		{
//			// Test case will pass
//		}
//		else
//		{
//			Assert.fail("Test has been Failed....!!");
//		}
	}

}
