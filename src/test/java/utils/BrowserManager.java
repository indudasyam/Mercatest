package utils;

import dataProviders.FileReaderManager;
import enums.DriverType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.openqa.selenium.remote.BrowserType.FIREFOX;



public class BrowserManager {

    public static WebDriver driver ;

    @Before
    public static WebDriver createDriver() {

        DriverType driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();

        switch (driverType) {
            case FIREFOX:
                FirefoxDriverManager.getInstance(FIREFOX).setup();
                driver = new FirefoxDriver();
                driver.manage().window().fullscreen();
                break;
            case CHROME:
                ChromeDriverManager.getInstance(CHROME).setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;
        }

        return driver;

    }


//    @After
//    public void quitDriver() {
//
//        if (driver != null) {
//            driver.manage().deleteAllCookies();
//            driver.close();
//            try{
//                driver.quit();
//            }catch (Exception e){
//                System.out.println("Browser closed already, " +
//                        "did not need to quit after all");
//                e.printStackTrace();
//            }        }
//    }

}
