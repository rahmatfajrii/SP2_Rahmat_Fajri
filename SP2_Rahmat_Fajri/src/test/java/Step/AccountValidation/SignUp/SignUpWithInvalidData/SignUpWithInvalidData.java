package Step.AccountValidation.SignUp.SignUpWithInvalidData;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpWithInvalidData {
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
    @And("^Input Email Adrress and Click Button Create$")
    public void Input_Email_Adrress_and_Click_Button_Create() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("qatester02@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
        Thread.sleep(1000);
    }
    @And("^Input Invalid Data and Click Register$")
    public void InputInvalid_Data_and_Click_Register() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("fajri");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("tester");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"days\"]")).sendKeys("7");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"months\"]")).sendKeys("March");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"years\"]")).sendKeys("2000");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"newsletter\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
        Thread.sleep(1000);
    }
    @Then("^User Failed to Register Account$")
    public void User_Failed_to_Register_Account() throws Throwable{
        System.out.println("System Show Error.");
        driver.quit();
    }
}
