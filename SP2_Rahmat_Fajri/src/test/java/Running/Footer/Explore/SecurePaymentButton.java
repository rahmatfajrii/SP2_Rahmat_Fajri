package Running.Footer.Explore;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Features/Footer/Explore/SecurePaymentButton", glue = "Step.Footer.Explore.SecurePaymentButton")

public class SecurePaymentButton {
}
