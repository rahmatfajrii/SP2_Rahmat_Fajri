package Step.Header.Menu.RoomsMenu;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoomsMenu {
    WebDriver driver;
    @Given("^User Navigate to Home Page Io$")
    public void User_Navigate_to_Home_Page_Io() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa.cilsy.id:8080/en/");
        Thread.sleep(1000);
    }
    @When("^Click Menu Button in Header$")
    public void Click_Menu_Button_in_Header() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button/span[2]")).click();
        Thread.sleep(1000);
    }
    @And("^Click Button Rooms$")
    public void Click_Button_Rooms() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[4]/a")).click();
        Thread.sleep(2000);
    }
    @Then("^User Navigated to Rooms Page$")
    public void User_Navigated_to_Rooms_Page() throws Throwable{
        System.out.println("System Show Rooms Page");
        driver.quit();
    }
}
