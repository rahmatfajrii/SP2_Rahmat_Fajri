package Running.Header.Menu;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Features/Header/Menu/TestimonialsMenu", glue = "Step.Header.Menu.TestimonialsMenu")

public class TestimonialsMenu {
}
