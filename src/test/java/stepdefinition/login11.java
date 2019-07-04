package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login11 {
	 WebDriver driver;
	@Given("user opens neutors app")
	public void user_opens_neutors_app() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://newtours.demoaut.com/");
	  driver.manage().window().maximize();
	}
	@When("user enters username as {string} And password {string}")
	public void user_enters_username_as_And_password(String un, String pwd) {
		driver.findElement(By.id("userName")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input")).click();
	}
	  
	@Then("Verify Pass")
	public void verify_Pass() {
	    driver.close();
	}


}
















