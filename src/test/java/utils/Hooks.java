package utils;

import org.junit.After;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public static final WebDriver driver = BrowserManager.createDriver();

    @After
    public void quitDriver() {

        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.close();
            try{
                driver.quit();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
