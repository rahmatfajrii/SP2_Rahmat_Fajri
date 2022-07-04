package Step.Footer.Explore.SecurePaymentButton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecurePaymentButton {
    WebDriver driver;
    @Given("^User Navigate to Home Page Io$")
    public void User_Navigate_to_Home_Page_Io() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa.cilsy.id:8080/en/");
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(1000);
    }
    @When("^Click Secure Payment Button In Footer$")
    public void Click_Secure_Payment_Button_In_Footer() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"footer\"]/div/div[4]/div/section/div[2]/ul/li[5]/a")).click();
        Thread.sleep(2000);
    }

    @Then("^User Navigated to Secure Payment Page$")
    public void User_Navigated_to_Secure_Payment_Page() throws Throwable{
        System.out.println("System Show Secure Payment Page");
        driver.quit();
    }
}
