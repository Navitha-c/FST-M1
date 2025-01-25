package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.time.Duration;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;

public class LoginTestSteps {

    WebDriver driver;
    WebDriverWait wait;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        // Set up WebDriver instance and WebDriverWait
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Update with actual path
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Open the login page
        driver.get("https://training-support.net/webelements/login-form");
    }

    @When("the user enters username and password")
    public void the_user_enters_username_and_password() {
        // Find the username and password input fields
        WebElement usernameField = driver.findElement(By.id("username")); // Make sure the ID is correct
        WebElement passwordField = driver.findElement(By.id("password")); // Make sure the ID is correct

        // Enter "admin" into the username field and "password" into the password field
        usernameField.sendKeys("admin");
        passwordField.sendKeys("password");
    }

    @When("clicks the submit button")
    public void clicks_the_submit_button() {
        // Find the Submit button and click it
        WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']")); // Adjust selector if needed
        submitButton.click();
    }

    @Then("get the confirmation message and verify it")
    public void get_the_confirmation_message_and_verify_it() {
        // Wait for the login confirmation message to be visible
        WebElement loginMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));
        
        // Get the confirmation message text
        String messageText = loginMessage.getText();

        // Assert that the login was successful
        Assert.assertEquals("Welcome Back, admin", messageText); // Adjust this string to match the actual message text
    }

    // Clean up: close the driver after test
    @After
    public void cleanUp() {
        driver.quit();
    }
}
