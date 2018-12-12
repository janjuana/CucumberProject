package com.syntax.cucumberproject.test.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewUser {
WebDriver driver;

@Given("^I opening browser$")
public void i_opening_browser() throws Throwable {
    System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\chromedriver.exe");
    driver = new ChromeDriver();

    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().window().fullscreen();
}

@Given("^I navigate FreeCrm$")
public void i_navigate_FreeCrm() throws Throwable {
    driver.get("https://www.freecrm.com/index.html");
}

@When("^I am on site I clik on sign up$")
public void i_am_on_site_I_clik_on_sign_up() throws Throwable {
    Thread.sleep(3000);
    driver.findElement(By.linkText("Sign Up")).click();
}

@When("^I click on Free Edition$")
public void i_click_on_Free_Edition() throws Throwable {

    WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control input-text']"));
    Select obj = new Select(dropdown);
    obj.selectByVisibleText("Free Edition");
}

@When("^I fill in new user information$")
public void i_fill_in_new_user_information() throws Throwable {
    driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("James");
    driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("Johnson");
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("joon@gmail.com");
    driver.findElement(By.xpath("//input[@name='email_confirm']")).sendKeys("joon@gmail.com");
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("john12");
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("smith12");
    driver.findElement(By.xpath("//input[@name='passwordconfirm']")).sendKeys("smith12");
}

@When("^I click agree terms box$")
public void i_click_agree_terms_box() throws Throwable {
    driver.findElement(By.xpath("//input[@name='agreeTerms']")).click();
}

@When("^I click on submit button$")
public void i_click_on_submit_button() throws Throwable {
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@class='myButton']")).click();

}

@When("^I fill in company name and number$")
public void i_fill_in_company_informaton() throws Throwable {
    driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("cucumber");
    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("000000000");
}

@When("^I click on continue$")
public void i_click_on_continue() throws Throwable {
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[@name='btnSubmit']")).click();
}

@Then("^I have successfully created new user$")
public void i_have_successfully_created_new_user() throws Throwable {
    boolean confirm = driver.findElement(By.xpath("//span[@class='text_normal']")).isDisplayed();
    Assert.assertTrue(confirm);
}

@Then("^I will quit browser$")
public void i_will_quit_browser() throws Throwable {
    driver.quit();
}

}
