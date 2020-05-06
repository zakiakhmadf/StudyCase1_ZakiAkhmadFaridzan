package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCart {

    public void clickTenderloinSteak() {
        WebElement tenderloin = AndroidDriverInstance.androidDriver
                .findElement(By.xpath("//android.widget.TextView[contains(@resource-id, 'name_text_view') and @text='Tenderloin Steak']"));
        tenderloin.click();
    }

    public String getQuantity() {
        WebElement quantity = AndroidDriverInstance.androidDriver.findElement(By.id("quantity_text_view"));
        return quantity.getText();
    }

    public String getNotes() {
        WebElement notes = AndroidDriverInstance.androidDriver.findElement(By.id("description_text_view"));
        return notes.getText();
    }
}
