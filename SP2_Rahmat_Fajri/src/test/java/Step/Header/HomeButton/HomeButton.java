package Step.Header.HomeButton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeButton {
    WebDriver driver;
    @Given("^User Navigate to Home Page Io$")
    public void User_Navigate_to_Home_Page_Io() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa.cilsy.id:8080/en/");
        Thread.sleep(1000);
    }
    @When("^Click Io Button Image in Header$")
    public void Click_Io_Button_Image_in_Header() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img")).click();
        Thread.sleep(1000);
    }

    @Then("^User Navigated to Io Home Page$")
    public void User_Navigated_to_Io_Home_Page() throws Throwable{
        System.out.println("System Show Io Home Page");
        driver.quit();
    }
}
