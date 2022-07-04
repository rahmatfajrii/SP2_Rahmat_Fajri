package Running.Body;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Features/Body/BookingHotels", glue = "Step.Body")

public class BookingHotels {

}
