package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/**
 * @author Jad
 *
 */
public class TestSteps {
	private static WebDriver ffDriver = null;
	static DesiredCapabilities capabilities = null;
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		//Create FireFox Driver Instance
		System.setProperty("webdriver.gecko.driver", "gecko/geckodriver.exe");
		capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marrionette", true);
		ffDriver = new FirefoxDriver(capabilities);
		//Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception 
		ffDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Launch the Online Store Website
		ffDriver.get("http://www.trademe.co.nz/");
	    throw new PendingException();
	}

	@When("^User Navigate to Gaming Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		// Find the element that is a href '/gaming'
        ffDriver.findElement(By.linkText("Gaming")).click();
	    throw new PendingException();
	}

	@Then("^Gaming Page Displayed Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
        System.out.println("Login Successfully");
	    throw new PendingException();
	}


}
