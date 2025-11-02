package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class firsttest {
	//declare class object
	WebDriver driver;
	//create a setup function 
	
	@BeforeClass
	public void Setup() {
		//Driver initializations
		driver = new FirefoxDriver();
		//open the page
		driver.get("https://training-support.net");
	}
	//create test functions
	 @Test
	public void pageTitleTest() {
		//verify the title of the page
		Assert.assertEquals(driver.getTitle(),"Trainig support");
		Assert.assertTrue(driver.findElement(By.linkText("About US")).isDisplayed());
		
	}
	//Create a tear down function
	 @AfterClass
	 public void teardown() {
		 //close the browser
		 driver.quit();
	 }
}
