package Session5Package.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventoryItemPage {
    WebDriver driver;

    public InventoryItemPage(WebDriver browserDriver) {
        driver = browserDriver;

    }
    public void addtoCartButtonClick (){
        WebElement addtToCartButton =  driver.findElement(By.xpath("//*[contains(@class,'btn_primary btn_inventory')]"));
        addtToCartButton.click();
    }

    public void backToInventoryButtonClick (){
        WebElement backToInventoryButton = driver.findElement(By.xpath("//*[contains(@class,'inventory_details_back_button')]"));
        backToInventoryButton.click();
    }

    public void proceedShoppingCartClick (){
        WebElement proceedShoppingCart = driver.findElement(By.xpath("//*[contains(@class,'shopping_cart_link fa-layers fa-fw')]"));
        proceedShoppingCart.click();
    }

    public WebElement getProductName(){
        WebElement productName=driver.findElement(By.className("inventory_details_name"));
        return productName;
    }

}
