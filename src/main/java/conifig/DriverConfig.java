package conifig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;


import java.io.File;

/**
 * Class Contains all Web Driver Configuration
 */
public class DriverConfig {

    public WebDriver driver;
    static String driverExecuter;
    static String applicationPath;
    public static String driverName;

    static {
        LoadPropertyFiles.readProperty();
        System.setProperty("driver","chrome");
        driverName = System.getProperty("driver").toLowerCase();
        applicationPath = System.getProperty("user.dir")+File.separator+"src"+File.separator+"drivers";

        switch (driverName){

            case ("chrome"):
                System.setProperty("webdriver.chrome.driver",applicationPath+File.separator+"chromedriver.exe");
                break;
            case ("firefox"):
                System.setProperty("driver.chrome.webdriver",applicationPath+File.separator+"chromedriver.exe");
                break;
        }
    }

    @BeforeTest(alwaysRun = true)
    public void _initDriver(){
        if(driverName.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
            launchApp();
        }else if(driverName.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
            launchApp();
        }else if(driverName.equalsIgnoreCase("ie")){
            driver = new InternetExplorerDriver();
            launchApp();
        }else {
            System.out.println("Requested driver is not supported");
        }
    }

    public void launchApp(){
        driver.get(LoadPropertyFiles.property.getProperty("app.url"));
    }

    public void quiteDriver(){
        driver.quit();
    }

    public void closeDriver(){
        driver.close();
    }
}
