package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReceiptPage {

    public boolean isOnPage() {
        WebElement newSale = AndroidDriverInstance.androidDriver.findElement(By.id("print_receipt_button"));
        return newSale.isDisplayed();
    }

    public String getChange() {
        WebElement change = AndroidDriverInstance.androidDriver.findElement(By.id("change_text_view"));
        return change.getText();
    }
}
