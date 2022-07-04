package Running.Footer.FollowUs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Features/Footer/FollowUs/FacebookButton", glue = "Step.Footer.FollowUs.FacebookButton")

public class FacebookButton {
}
