package Session5Package.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage {
    WebDriver driver;

    public ShoppingCartPage(WebDriver browserDriver) {
        driver = browserDriver;
        WebElement shoppingCard =  driver.findElement(By.xpath("//*[contains(@class,'svg-inline--fa fa-shopping-cart fa-w-18 fa-3x ')]"));
        shoppingCard.click();
    }

    public void checkoutButtonClick(){
        WebElement checkoutButton =  driver.findElement(By.xpath("//*[contains(@class,'btn_action checkout_button')]"));
        checkoutButton.click();
    }
}
