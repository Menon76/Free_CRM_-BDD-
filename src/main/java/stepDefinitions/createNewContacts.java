package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class createNewContacts {
	WebDriver driver;

	@Given ("^Login Page$")
	public void login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\menon\\Downloads\\chromedriver-win64_\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	@SuppressWarnings("deprecation")
	@When ("^title is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Account Login",title);
	}
	@Then ("^user enters username and password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.id("input-email")).sendKeys("menonsuraj123@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Quantiphi@123");
		
	}
	@Then ("^login button$")
	public void user_clicks_on_login_button() {
		WebElement loginbutton= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		loginbutton.click();
	}
	@Then ("^home page$")
	public void user_is_on_home_page() {
		String HomepageTitle=driver.getTitle();
		System.out.println(HomepageTitle);
		Assert.assertEquals("My Account",HomepageTitle);
	}

	@Then ("^user moves to new contact page$")
	public void user_moves_to_new_contact_page() {
		WebElement link=driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[2]/a"));
				link.click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[1]/h4/a")).click();
		driver.findElement(By.id("button-cart"));
	}
	@Then ("^user enters contact details firstname and lastname and position$")
	public void user_enters_contact_details_firstname_and_lastname_and_position() {
		
	}
	@Then ("^Close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

}
