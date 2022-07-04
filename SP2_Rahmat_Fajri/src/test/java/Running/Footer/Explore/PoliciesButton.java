package Running.Footer.Explore;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Features/Footer/Explore/PoliciesButton", glue = "Step.Footer.Explore.PoliciesButton")

public class PoliciesButton {

}
