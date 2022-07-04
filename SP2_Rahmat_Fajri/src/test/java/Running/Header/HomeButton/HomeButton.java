package Running.Header.HomeButton;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Features/Header/HomeButton", glue = "Step.Header.HomeButton")

public class HomeButton {

}
