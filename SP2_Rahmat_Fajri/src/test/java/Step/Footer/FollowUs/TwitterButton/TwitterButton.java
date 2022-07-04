package Step.Footer.FollowUs.TwitterButton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwitterButton {
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
    @When("^Click Twitter Button In Footer$")
    public void Click_Twitter_Button_In_Footer() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"social_block\"]/ul/li[2]/a")).click();
        Thread.sleep(2000);
    }

    @Then("^User Switch Navigated to Twitter Page$")
    public void User_Switch_Navigated_to_Twitter_Page() throws Throwable{
        driver.navigate().to("https://twitter.com/qloapps");
        System.out.println("System Show Twitter Page");
        driver.quit();
    }
}
