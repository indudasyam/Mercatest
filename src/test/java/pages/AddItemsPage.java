package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Hooks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class AddItemsPage extends Hooks {

    String eachItemPrice;
    Double highestPrice;
    public  void addMostExpensiveItemtotheCart() throws InterruptedException {

        List<WebElement> itemPriceWebelementList = driver.findElements(By.className("inventory_item_price"));
        List<Double> itemPriceList = new ArrayList<>();

        for(int i =0; i< itemPriceWebelementList.size();i++) {
            eachItemPrice = (itemPriceWebelementList.get(i).getText().replace("$",""));
            double dressPricesDouble = Double.parseDouble(eachItemPrice);
            itemPriceList.add(dressPricesDouble);
        }
         highestPrice = Collections.min(itemPriceList);
        int indexOfHighest = itemPriceList.indexOf(highestPrice);
        int k = indexOfHighest+1; //1 denotes the start index li number on the webpage, unlike the index of the dressprice list which starts from 0
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div"+"["+k+"]"+"/div[2]/div[2]/button")).click();
    }

    public void verifyCartItems(){
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        String verifyHighestIsInCart =  driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/div")).getText();
        Assert.assertEquals(true, verifyHighestIsInCart.contains(highestPrice.toString()));
    }

}
