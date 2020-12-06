package Session5Package.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutTwoPage {
    WebDriver driver;

    public CheckoutTwoPage(WebDriver browserDriver) {
        driver = browserDriver;
        WebElement checkouttwopage = driver.findElement(By.xpath("//*[contains(@class,'btn_primary cart_button')]"));
        checkouttwopage.click();
    }

}
