package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ItemDetailPopUp {

    public void inputQuantity(String quantity) {
        WebElement inputQuantity = AndroidDriverInstance.androidDriver.findElement(By.id("choose_item_variant_quantity"));
        inputQuantity.clear();
        inputQuantity.sendKeys(quantity);
    }

    public void inputNotes(String notes) {
        WebElement inputNotes = AndroidDriverInstance.androidDriver.findElement(By.id("view_item_note_tablet_desc"));
        inputNotes.sendKeys(notes);
    }

    public void clickSave() {
        WebElement save = AndroidDriverInstance.androidDriver.findElement(By.id("tablet_ok_button"));
        save.click();
    }
}
