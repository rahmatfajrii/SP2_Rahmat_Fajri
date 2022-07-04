package Step.Header.ViewCart;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewCart {
    WebDriver driver;
    @Given("^User Navigate to Home Page Io$")
    public void User_Navigate_to_Home_Page_Io() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa.cilsy.id:8080/en/");
        Thread.sleep(1000);
    }
    @When("^Click Button View Cart$")
    public void Click_Button_View_Cart() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[4]/div/a")).click();
        Thread.sleep(1000);
    }

    @Then("^User Navigated to View Cart Page$")
    public void User_Navigated_to_View_Cart_Page() throws Throwable{
        System.out.println("System Show View Cart Page");
        driver.quit();
    }
}
