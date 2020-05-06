package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutPopUp {

    public void inputCash(String cash) {
        WebElement inputCash = AndroidDriverInstance.androidDriver.findElement(By.id("cash_edit_text"));
        inputCash.sendKeys(cash);
    }

    public void clickCharge() {
        WebElement charge = AndroidDriverInstance.androidDriver.findElement(By.id("tablet_ok_button"));
        charge.click();
    }

    public String chargeDisable() {
        WebElement charge = AndroidDriverInstance.androidDriver.findElement(By.id("tablet_ok_button"));
        return charge.getAttribute("enabled");
    }

    public void clickSuggestedExactCash() {
        WebElement suggest = AndroidDriverInstance.androidDriver.findElement(By.id("cash_suggest_lowest"));
        suggest.click();
    }

    public void clickSuggestedMoreCash() {
        WebElement suggest = AndroidDriverInstance.androidDriver.findElement(By.id("cash_suggest_middle"));
        suggest.click();
    }
}
