package stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import testUtils.BaseClass;

public class LoginSteps extends BaseClass {


	@Given("^I open browser$")
	public void i_open_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Given("^I navigate to the FreeCRM$")
	public void i_navigate_to_the_FreeCRM() throws Throwable {

		driver.get("https://www.freecrm.com/index.html");
	}

	@When("^I click login button$")
	public void i_click_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
	}

	@Then("^I successfully logged in$")
	public void i_successfully_logged_in() throws Throwable {
		driver.switchTo().frame(1);
		boolean check = driver.findElement(By.xpath("//a[@title='Docs']")).isDisplayed();

	}

	@Then("^I see error message$")
	public void i_see_error_message() throws Throwable {
		boolean check2 = driver.findElement(By.xpath("//a[@class='navbar-brand']//img[@class='img-responsive']"))
				.isDisplayed();

	}

	@Then("^I close browser$")
	public void i_close_browser() throws Throwable {
		driver.quit();
	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String uName, String pwd) throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
	}

}
