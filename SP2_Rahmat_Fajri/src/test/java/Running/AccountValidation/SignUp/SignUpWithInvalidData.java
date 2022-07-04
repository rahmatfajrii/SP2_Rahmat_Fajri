package Running.AccountValidation.SignUp;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Features/AccountValidation/SignUp/SignUpWithInvalidData", glue = "Step.AccountValidation.SignUp.SignUpWithInvalidData")

public class SignUpWithInvalidData {
}
