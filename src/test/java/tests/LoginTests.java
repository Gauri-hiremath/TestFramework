package tests;

import flows.LoginFlow;
import org.testng.annotations.Test;

/**
 * Class contains all the test scenario  for Login feature
 */
public class LoginTests {

    LoginFlow loginFlow = new LoginFlow();

    @Test(description = "Validate login feature with valid login details")
    public void validateLoginWithValidLoginDetails(){
        loginFlow.LoginFlowFunction();

    }

    @Test(description = "Validate login feature with valid login details")
    public void validateLoginWithInValidLoginDetails(){
        loginFlow.LoginFlowFunction();

    }

    @Test(description = "Validate login feature with valid login details")
    public void validateLoginWithUsernameOnly(){
        loginFlow.LoginFlowFunction();

    }
}
