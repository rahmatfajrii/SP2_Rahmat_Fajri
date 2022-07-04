package Running.Footer.Explore;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Features/Footer/Explore/TermsAndConditionsButton", glue = "Step.Footer.Explore.TermsAndConditionsButton")

public class TermsAndConditionsButton {
}
