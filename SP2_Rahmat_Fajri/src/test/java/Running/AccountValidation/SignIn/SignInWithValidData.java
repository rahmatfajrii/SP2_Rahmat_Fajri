package Running.AccountValidation.SignIn;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Features/AccountValidation/SignIn/SignInWithValidData", glue = "Step.AccountValidation.SignIn.SignInWithValidData")

public class SignInWithValidData {

}
