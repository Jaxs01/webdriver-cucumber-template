package runner;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author Jad - prototype class
 *
 */
public class CucumberTest {
	private static WebDriver ffDriver = null;
	static DesiredCapabilities capabilities = null;
	
	public static void main(String[] args) {
		//Create FireFox Driver Instance
		System.setProperty("webdriver.gecko.driver", "gecko/geckodriver.exe");
		capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marrionette", true);
		ffDriver = new FirefoxDriver(capabilities);
		//Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception 
        ffDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Launch the Online Store Website
        ffDriver.get("http://www.store.demoqa.com");
        // Find the element that's ID attribute is 'account'(My Account) 
        ffDriver.findElement(By.xpath(".//*[@id='account']/a")).click();
        // Find the element that's ID attribute is 'log' (Username)
        // Enter Username on the element found by above desc.
        ffDriver.findElement(By.id("log")).sendKeys("testuser_1"); 
        // Find the element that's ID attribute is 'pwd' (Password)
        // Enter Password on the element found by the above desc.
        ffDriver.findElement(By.id("pwd")).sendKeys("Test@123");
        // Now submit the form. WebDriver will find the form for us from the element 
        ffDriver.findElement(By.id("login")).click();
        // Print a Log In message to the screen
        System.out.println("Login Successfully");
        // Find the element that's ID attribute is 'account_logout' (Log Out)
        ffDriver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
        // Print a Log In message to the screen
        System.out.println("LogOut Successfully");
        // Close the driver
        ffDriver.quit();
		
	}

}
