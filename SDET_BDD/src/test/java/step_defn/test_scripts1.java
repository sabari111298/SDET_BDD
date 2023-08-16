package step_defn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test_scripts1 {
	
	WebDriver d1;
	
	@Given("Open chrome browser and url of the appln")
	public void open_chrome_browser_and_url_of_the_appln() {
	    
		WebDriverManager.chromedriver().setup();
		d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://demo.openmrs.org/openmrs/login.htm");
		System.out.println("Open chrome browser and url of the appln");
	}

	@When("Enter valid username and valid password")
	public void enter_valid_username_and_valid_password() {
	    
		d1.findElement(By.id("username")).sendKeys("Admin");
		d1.findElement(By.id("password")).sendKeys("Admin123");
		d1.findElement(By.xpath("//*[@id=\"Inpatient Ward\"]")).click();
		System.out.println("Enter valid username and valid password");
	}

	@When("Click login button")
	public void click_login_button() {
	    
		d1.findElement(By.id("loginButton")).click();
		System.out.println("Click login button");
		
	}

	@Then("login to account")
	public void login_to_account() {
	    
		System.out.println("login to account");
		
	}
	
	@When("Enter invalid username and invalid password")
	public void enter_invalid_username_and_invalid_password() {
	    
		d1.findElement(By.id("username")).sendKeys("sabari");
		d1.findElement(By.id("password")).sendKeys("Admin123");
		d1.findElement(By.xpath("//*[@id=\"Inpatient Ward\"]")).click();
	    System.out.println("Enter invalid username and invalid password");
	}

	@Then("error msg to be diplayed-invalid details")
	public void error_msg_to_be_diplayed_invalid_details() {
	    
	    System.out.println("error msg to be diplayed-invalid details");
	}




}
