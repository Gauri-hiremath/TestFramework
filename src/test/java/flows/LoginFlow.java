package flows;

import pages.LoginPage;

/**
 * Class contains flows / action methods for login tests
 */
public class LoginFlow {

    LoginPage page = new LoginPage();

    public void LoginFlowFunction(){
        page.loginApp();
    }
}
