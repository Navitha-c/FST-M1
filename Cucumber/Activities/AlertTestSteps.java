package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.And;
import java.time.Duration;
import java.util.List;
import java.time.Duration;

import org.junit.After;
import org.junit.Assert;

public class AlertTestSteps {

    WebDriver driver;
    WebDriverWait wait;

    @Given("User is on the page")
    public void user_is_on_the_page() {
        // Set up WebDriver and WebDriverWait
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Update path
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Navigate to the alerts page
        driver.get("https://training-support.net/webelements/alerts");
    }

    @When("User clicks the Simple Alert button")
    public void user_clicks_the_simple_alert_button() {
        // Find the Simple Alert button and click it
        WebElement simpleAlertButton = driver.findElement(By.id("simple"));
        simpleAlertButton.click();
    }

    @When("User clicks the Confirm Alert button")
    public void user_clicks_the_confirm_alert_button() {
        // Find the Confirm Alert button and click it
        WebElement confirmAlertButton = driver.findElement(By.id("confirm"));
        confirmAlertButton.click();
    }

    @When("User clicks the Prompt Alert button")
    public void user_clicks_the_prompt_alert_button() {
        // Find the Prompt Alert button and click it
        WebElement promptAlertButton = driver.findElement(By.id("prompt"));
        promptAlertButton.click();
    }

    @Then("Alert opens")
    public void alert_opens() {
        // Switch to the alert
        Alert alert = driver.switchTo().alert();
        Assert.assertNotNull(alert);  // Check if the alert is present
    }

    @And("Read the text from it and print it")
    public void read_the_text_from_it_and_print_it() {
        // Switch to the alert and get the text
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Alert text: " + alertText);
    }

    @And("Close the alert")
    public void close_the_alert() {
        // Close the alert by accepting it
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    @And("Close the alert with Cancel")
    public void close_the_alert_with_cancel() {
        // Close the alert by dismissing it (works for confirm and prompt alerts)
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    @And("Write a custom message in it")
    public void write_a_custom_message_in_it(io.cucumber.datatable.DataTable data) {
        // Get the message from the example table
        String message = data.cells().get(0); // Taking first example value
        // Switch to the prompt alert and type the message
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(message);
    }

    @And("Read the result text")
    public void read_the_result_text() {
        // Find the result text element and get its text
        WebElement resultText = driver.findElement(By.id("result"));
        String result = resultText.getText();
        System.out.println("Result text: " + result);
    }

    // Cleanup after the test
    @After
    public void cleanUp() {
        driver.quit();
    }
}
