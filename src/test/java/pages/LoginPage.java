package pages;

import conifig.DriverConfig;
import pages.repository.LoginPageRepo;

/**
 * Class contains UI locaters for Login screen and action methods
 */
public class LoginPage extends DriverConfig {


    public void loginApp(){
        driver.findElement(LoginPageRepo.loginBtn).click();
    }
}
