package Session5Package;

import Session5Package.Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;

public class SauceDemoPOMAdvancedTest {
    WebDriver driver;
    WebDriverWait wait;
    private String user = "standard_user";
    private String passwd= "secret_sauce";

    @Test
    public void SauceDemoAddCartAdvanced() throws Exception {
        System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/index.html");

        // login
        LogInPage3 logInPage = new LogInPage3(driver);
        logInPage.logIn(user,passwd);

        //list item
        InventoryPage inventoryPage = new InventoryPage(driver);
        List <WebElement> options = inventoryPage.listItems();
        options.get(2).click();

        // select first item link
        List <WebElement> products = inventoryPage.getProductNameLinks();
        products.get(0).click();

        // add item to the shopping cart
        InventoryItemPage inventoryItemPage = new InventoryItemPage(driver);
        inventoryItemPage.addtoCartButtonClick();

        // back to Inventory page and add the select first item by clicking its image
        inventoryItemPage.backToInventoryButtonClick();
        List <WebElement> imagesOfProducts = inventoryPage.selectItemByClick();
        imagesOfProducts.get(0).click();
        inventoryItemPage.addtoCartButtonClick();

        // proceed shopping cart page
        inventoryItemPage.proceedShoppingCartClick();

        // check the items on that list are correct
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        /*shoppingCartPage.getClass();
        List <WebElement> nameOfItems = shoppingCartPage.getNameofItems();
        for(int i=0; i<nameOfItems.size();i++){
            nameOfItems.get(i).click();
            WebElement nameOfItemInInventoryItem = inventoryItemPage.getProductName();
            String expected = nameOfItems.get(i).getText();
            Assert.assertEquals(expected,nameOfItemInInventoryItem);
            inventoryItemPage.proceedShoppingCartClick();
        }*/

        // proceed to checkout
        shoppingCartPage.checkoutButtonClick();

        // complete and logout
        /*CheckoutOnePage checkoutOnePage = new CheckoutOnePage(driver);
        WebElement firstName = checkoutOnePage.getFirstName();
        WebElement lastName = checkoutOnePage.getLastName();
        WebElement postalCode = checkoutOnePage.getPostalCode();

        if (!firstName.getAttribute("value").equals("") && !lastName.getAttribute("value").equals("")
        && !postalCode.getAttribute("value").equals("")) {
            checkoutOnePage.continueButtonClick();
        }*/
        MenuPage menuPage = new MenuPage(driver);
        menuPage.logOut();
    }
    public static void main(String args[]) throws Exception {
        SauceDemoPOMAdvancedTest test = new SauceDemoPOMAdvancedTest();
        test.SauceDemoAddCartAdvanced();
    }

}
