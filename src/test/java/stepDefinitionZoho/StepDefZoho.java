package stepDefinitionZoho;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class StepDefZoho 
{
	
	public WebDriver driver;
	@Given("^to open Chrome browser$")
	public void to_open_Chrome_browser() throws Throwable 
	{
	   System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver123.exe");
	   driver=new ChromeDriver();
	}

	@When("^Enter the url \"([^\"]*)\"$")
	public void enter_the_url(String arg1) throws Throwable 
	{
		driver.get("https://www.zoho.com/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^click on sign button$")
	public void click_on_sign_button() throws Throwable
	{
		driver.findElement(By.xpath("//a[@class='zh-login']")).click();
	}

	@When("^enter the Email and Password$")
	public void enter_the_Email_and_Password() throws Throwable 
	{
		driver.findElement(By.xpath("//input[@id='login_id']")).sendKeys("amitdmandlik46@gmail.com");
		driver.findElement(By.xpath("(//button[@class='btn blue'])[2]")).click();

	}

	@Then("^user should be on homepage$")
	public void user_should_be_on_homepage() throws Throwable {
	   
	}


}
