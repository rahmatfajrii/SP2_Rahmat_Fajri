package Step.AccountValidation.SignIn.SignInWithInvalidData;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInWithInvalidData {
    WebDriver driver;
    @Given("^User Navigate to Home Page Io$")
    public void User_Navigate_to_Home_Page_Io() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa.cilsy.id:8080/en/");
        Thread.sleep(1000);
    }
    @When("^Click Button Sign In$")
    public void Click_Button_Sign_In() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a/span")).click();
        Thread.sleep(1000);
    }
    @And("^Input Invalid Email Password and Click Sign In$")
    public void Input_Invalid_Email_Password_and_Click_Sign_In() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("qatester02@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("test12");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
        Thread.sleep(1000);
    }
    @Then("^User Failed to Login$")
    public void User_Failed_to_Login() throws Throwable{
        System.out.println("System Show Login Failed.");
        driver.quit();
    }
}
