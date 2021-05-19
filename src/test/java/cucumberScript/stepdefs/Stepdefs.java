package cucumberScript.stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefs {
	WebDriver driver;
	String url = "https://amazon.in";
	 

		@Given("User Opened the Browser")
		public void user_opened_the_browser() {
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\exes\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}


		

		@When("User navigated to the app url")
		public void user_navigated_to_the_app_url() {
		    driver.get(url);
		}
		@Then("User is able to see application landing page")
		public void user_is_able_to_see_application_landing_page() {
		    String titleExpected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		    String titleActual = driver.getTitle();
		    Assert.assertEquals(titleExpected, titleActual);
		}
	
			@Given("User Opened the Browser and User navigated to the App url")
			public void user_opened_the_browser_and_user_navigated_to_the_app_url() {
				user_opened_the_browser();
				user_navigated_to_the_app_url();
			}

            @When("User search for a product")
			public void user_search_for_a_product() {
			    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for women stylish");
			}
			@Then("Search result for the product is displayed")
			public void search_result_for_the_product_is_displayed() {
			    System.out.println("List of bags displayed");
			}







}
