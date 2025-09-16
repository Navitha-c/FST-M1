package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
	
	public static void main(String[] args) {
		//intiliaze web driver
		WebDriver driver = new FirefoxDriver();
		
	  driver.get("https://training-support.net");
	  //verify the page tile
	  System.out.println("page tile:"+ driver.getTitle());
	  //locate and click the about us link
	  driver.findElement(By.linkText("About Us")).click();
	  
	  //print the title about page
	  System.out.println("New page title is :" + driver.getTitle());
	  
	  //close the browser
	  driver.quit();
	}
	}


