package Step.Body;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingHotel {
    WebDriver driver;
    @Given("^User Navigate to Home Page Io$")
    public void User_Navigate_to_Home_Page_Io() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa.cilsy.id:8080/en/");
        Thread.sleep(1000);
    }
    @When("^Login with Valid Account First$")
    public void Login_with_Valid_Account_First() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("qatester02@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("test123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
        Thread.sleep(1000);
    }
    @And("^Click Home and Input The Hotel Want to Book and Then Click Search$")
    public void Click_Home_and_Input_The_Hotel_Want_to_Book_and_Then_Click_Search() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/a/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"hotel_location\"]")).sendKeys("Aceh");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"id_hotel_button\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"search_hotel_block_form\"]/div[2]/div/ul/li")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"check_in_time\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[6]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[3]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"search_room_submit\"]/span")).click();
        Thread.sleep(1000);
    }
    @And("^Click Book Now and Input Required Data and Click Save$")
    public void Click_Book_Now_and_Input_Required_Data_and_Click_Save() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"category_data_cont\"]/div[4]/div/div[2]/a/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Padang");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("11111");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Padang City");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"id_state\"]")).sendKeys("West Sumatra");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("1234567890");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"submitAddress\"]/span")).click();
        Thread.sleep(1000);
    }
    @And("^Click Process and Click Payment With and Confirm Order$")
    public void Click_Process_and_Click_Payment_With_and_Confirm_Order() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"collapse-shopping-cart\"]/div/div[2]/div[2]/div/a/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"collapse-guest-info\"]/div/div[4]/div/a/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
        Thread.sleep(1000);
    }
    @Then("^User Success to Booking Hotel$")
    public void User_Success_to_Booking_Hotel() throws Throwable{
        System.out.println("System Show Your order on Small Project QA13 is complete.");
        driver.quit();
    }
}
