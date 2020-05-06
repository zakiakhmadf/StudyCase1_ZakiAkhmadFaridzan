package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Favourites {

    public boolean loginSuccess() {
        WebElement favourites = AndroidDriverInstance.androidDriver.findElement(By.id("toolbar_bar_favourite"));
        return favourites.isDisplayed();
    }

    public void clickTenderloinSteak() {
        WebElement tenderloin = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'Tenderloin Steak')]"));
        tenderloin.click();
    }

    public void clickCharge() {
        WebElement charge = AndroidDriverInstance.androidDriver.findElement(By.id("checkoutButton"));
        charge.click();
    }

    public String chargeDisable() {
        WebElement charge = AndroidDriverInstance.androidDriver.findElement(By.id("checkoutButton"));
        return charge.getAttribute("enabled");
    }

    public void clickIceTea() {
        WebElement tea = AndroidDriverInstance.androidDriver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'Ice Tea')]"));
        tea.click();
    }
}
