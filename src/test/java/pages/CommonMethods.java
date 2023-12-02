package pages;

import base.PageUrls;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.Hooks;


public class CommonMethods extends Hooks {

     String UserName = "standard_user";
     String Password = "secret_sauce";
    public void getValidatePage(String pageName) {
        driver.get(PageUrls.getPageUrl(pageName));
        Assert.assertEquals(PageUrls.getPageUrl(pageName),driver.getCurrentUrl().replaceAll("#",""));
    }

    public void enterCredentials(){
        driver.findElement(By.id("user-name")).sendKeys(UserName);
        driver.findElement(By.id("password")).sendKeys(Password);
    }

    public void clickLogin(){
        driver.findElement(By.id("login-button")).click();
    }

}
