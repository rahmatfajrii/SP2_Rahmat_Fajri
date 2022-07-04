package Running.AccountValidation.SignIn;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Features/AccountValidation/SignIn/SignInWithInvalidData", glue = "Step.AccountValidation.SignIn.SignInWithInvalidData")

public class SignInWithInvalidData {

}
