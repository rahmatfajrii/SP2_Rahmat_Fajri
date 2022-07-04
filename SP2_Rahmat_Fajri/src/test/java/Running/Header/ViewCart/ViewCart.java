package Running.Header.ViewCart;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Features/Header/ViewCart", glue = "Step.Header.ViewCart")

public class ViewCart {
}
