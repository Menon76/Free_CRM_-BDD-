package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class LoginstepDefinition {
	WebDriver driver;
	
	@Given("^user is already on the login page$")
	public void user_already_on_the_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\menon\\Downloads\\chromedriver-win64_\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		
	}
	@SuppressWarnings("deprecation")
	@When("^title of login page is FreeCRM$")
	public void title_of_login_page_is_FreeCRM() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Account Login",title);
		
	}
	@Then("^user enters user name and password$")
	public void user_enters_user_name_and_password() {
		driver.findElement(By.id("input-email")).sendKeys("menonsuraj123@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Quantiphi@123");
		
	}
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
	WebElement loginbutton= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
	loginbutton.click();
	}
	@SuppressWarnings("deprecation")
	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String HomepageTitle=driver.getTitle();
		System.out.println(HomepageTitle);
		Assert.assertEquals("My Account",HomepageTitle);
	}
	}

