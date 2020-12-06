package Session5Package.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOnePage {
    WebDriver driver;

    public CheckoutOnePage(WebDriver browserDriver) {
        driver = browserDriver;
        WebElement checkoutOnePage = driver.findElement(By.xpath("//*[contains(@class,'btn_action checkout_button')]"));
        checkoutOnePage.click();
    }

    public WebElement getFirstName(){
        WebElement firstName = driver.findElement(By.xpath("//*[@class='checkout_info'][@id='first-name']"));
        return firstName;
    }

    public WebElement getLastName(){
        WebElement lastName = driver.findElement(By.xpath("//*[@class='checkout_info'][@id='last-name']"));
        return lastName;
    }

    public WebElement getPostalCode(){
        WebElement postalCode = driver.findElement(By.xpath("//*[@class='checkout_info'][@id='postal-code']"));
        return postalCode;
    }

    public void continueButtonClick (){
        WebElement continueButton =  driver.findElement(By.xpath("//*[contains(@class,'btn_primary cart_button')]"));
        continueButton.click();
    }
}
