package Step.Footer.FollowUs.FacebookButton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookButton {
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
    @When("^Click Facebook Button In Footer$")
    public void Click_Facebook_Button_In_Footer() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"social_block\"]/ul/li[1]/a")).click();
        Thread.sleep(2000);
    }

    @Then("^User Switch Navigated to Facebook Page$")
    public void User_Switch_Navigated_to_Facebook_Page() throws Throwable{
        driver.navigate().to("https://www.facebook.com/qloapps");
        System.out.println("System Show Facebook Page");
        driver.quit();
    }
}
