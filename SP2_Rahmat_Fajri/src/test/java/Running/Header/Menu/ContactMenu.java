package Running.Header.Menu;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Features/Header/Menu/ContactMenu", glue = "Step.Header.Menu.ContactMenu")

public class ContactMenu {
}
