package Stepdefenation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepJava {
	
		
		
		ChromeDriver driver;
		
		@Given("^User is on Home Page$")
		public void user_is_on_Home_Page() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\santa\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
			driver=new ChromeDriver();
		   
		}

		@When("^User Navigate to LogIn Page$")
		public void user_Navigate_to_LogIn_Page() throws Throwable {
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize(); 
		    
		}

		@When("^User enters <\"(.*?)\"> and <\"(.*?)\">$")
		public void user_enters_and(String arg1, String arg2) throws Throwable {
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("bpriyankav@gmail.com");
			
			driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Priyanka@1953"); 
		
		}

		@Then("^Message displayed Login Successfully$")
		public void message_displayed_Login_Successfully() throws Throwable {
			driver.findElement(By.xpath("//*[@id='u_0_2' and @value='Log In'and @type='submit'and @data-testid='royal_login_button']")).click();
		
		}
	}


