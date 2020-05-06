package demo.steps_definition;

import demo.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MokaStepDefinitions {

  StartPage startPage = new StartPage();
  LoginPage loginPage = new LoginPage();
  Favourites favourites = new Favourites();
  CheckoutPopUp checkoutPopUp = new CheckoutPopUp();
  ReceiptPage receiptPage = new ReceiptPage();
  ShoppingCart shoppingCart = new ShoppingCart();
  ItemDetailPopUp itemDetailPopUp = new ItemDetailPopUp();

  @Given("User is on moka start page")
  public void userIsOnMokaStartPage() {
    boolean actual = startPage.isOnPage();
    Assert.assertTrue(actual);
  }

  @When("User click sign in button on moka start page")
  public void userClickSignInButtonOnMokaStartPage() {
    startPage.clikSignInButton();
  }

  @When("User input email {string}")
  public void userInputEmail(String email) {
    loginPage.inputUsername(email);
  }

  @When("User input password {string}")
  public void userInputPassword(String password) {
    loginPage.inputPassword(password);
  }

  @When("User click Sign in button")
  public void userClickSignInButton() {
    loginPage.clickSignIn();
  }

  @Then("User success login")
  public void userSuccessLogin() {
    boolean success = favourites.loginSuccess();
    Assert.assertTrue(success);
  }

  @When("User input phone {string}")
  public void userInputPhone(String phone) {
    loginPage.inputUsername(phone);
  }

  @Then("User see error message {string}")
  public void userSeeErrorMessage(String error) {
    String actualError = loginPage.authenticationFailed();
    Assert.assertEquals(error, actualError);
  }

  @Then("User cannot click Sign in button")
  public void userCannotClickSignInButton() {
    String enabled = loginPage.cannotSignIn();
    Assert.assertEquals("false", enabled);
  }

  @Given("User login with correct email and password")
  public void userLoginWithCorrectEmailAndPassword() {
    String email = "zakiakhmadf20@gmail.com";
    String password = "abc12345";

    userClickSignInButtonOnMokaStartPage();
    userInputEmail(email);
    userInputPassword(password);
    userClickSignInButton();
    userSuccessLogin();
  }

  @When("User click Tenderloin Steak")
  public void userClickTenderloinSteak() {
    favourites.clickTenderloinSteak();
  }

  @When("User click Charge button")
  public void userClickChargeButton() {
    favourites.clickCharge();
  }

  @When("User input {string} for cash on checkout pop up")
  public void userInputForCashOnCheckoutPopUp(String cash) {
    checkoutPopUp.inputCash(cash);
  }

  @When("User click Charge button on checkout pop up")
  public void userClickChargeButtonOnCheckoutPopUp() {
    checkoutPopUp.clickCharge();
  }

  @Then("User is on receipt page")
  public void userIsOnReceiptPage() {
    boolean actual = receiptPage.isOnPage();
    Assert.assertTrue(actual);
  }

  @Then("User see {string} as receipt page title")
  public void userSeeAsReceiptPageTitle(String change) {
    String actualChange = receiptPage.getChange();
    Assert.assertEquals(change, actualChange);
  }

  @Then("User cannot click Charge button on checkout pop up")
  public void userCannotClickChargeButtonOnCheckoutPopUp() {
    String actual = checkoutPopUp.chargeDisable();
    Assert.assertEquals("false", actual);
  }

  @When("User click first suggested cash")
  public void userClickFirstSuggestedCash() {
    checkoutPopUp.clickSuggestedExactCash();
  }

  @When("User click second suggested cash")
  public void userClickSecondSuggestedCash() {
    checkoutPopUp.clickSuggestedMoreCash();
  }

  @When("User click Tenderloin Steak on shopping cart")
  public void userClickTenderloinSteakOnShoppingCart() {
    shoppingCart.clickTenderloinSteak();
  }

  @When("User input {string} to quantity field")
  public void userInputToQuantityField(String quantity) {
    itemDetailPopUp.inputQuantity(quantity);
  }

  @When("User input {string} as notes")
  public void userInputAsNotes(String notes) {
    itemDetailPopUp.inputNotes(notes);
  }

  @When("User click Save button")
  public void userClickSaveButton() {
    itemDetailPopUp.clickSave();
  }

  @Then("User see the quantity of spaghetti is set to {string} on shopping cart")
  public void userSeeTheQuantityOfSpaghettiIsSetToOnShoppingCart(String quantity) {
    String actual = shoppingCart.getQuantity();
    Assert.assertEquals(quantity, actual);
  }

  @Then("User see there is {string} below Spaghetti on shopping cart")
  public void userSeeThereIsBelowSpaghettiOnShoppingCart(String notes) {
    String actual = shoppingCart.getNotes();
    Assert.assertEquals(notes, actual);
  }

  @When("User click Ice Tea")
  public void userClickIceTea() {
    favourites.clickIceTea();
  }
}
