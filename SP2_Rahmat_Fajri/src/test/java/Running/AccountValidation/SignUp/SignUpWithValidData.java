package Running.AccountValidation.SignUp;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Features/AccountValidation/SignUp/SignUpWithValidData", glue = "Step.AccountValidation.SignUp.SignUpWithValidData")

public class SignUpWithValidData {

}
