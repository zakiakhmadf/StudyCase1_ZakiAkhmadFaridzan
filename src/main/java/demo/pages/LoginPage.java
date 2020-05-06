package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public void inputUsername(String username) {
        WebElement inputUsername = AndroidDriverInstance.androidDriver.findElement(By.id("emailOrPhoneEditText"));
        inputUsername.sendKeys(username);
    }

    public void inputPassword(String password) {
        WebElement inputPassword = AndroidDriverInstance.androidDriver.findElement(By.id("passwordEditText"));
        inputPassword.sendKeys(password);
    }

    public void clickSignIn() {
        WebElement signIn = AndroidDriverInstance.androidDriver.findElement(By.id("signInButton"));
        signIn.click();
    }

    public String authenticationFailed() {
        WebElement error = AndroidDriverInstance.androidDriver.findElement(By.id("errorSignInTextView"));
        return error.getText();
    }

    public String cannotSignIn() {
        WebElement signIn = AndroidDriverInstance.androidDriver.findElement(By.id("signInButton"));
        return signIn.getAttribute("enabled");
    }

}
