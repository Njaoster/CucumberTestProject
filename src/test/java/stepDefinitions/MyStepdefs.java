package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;



public class MyStepdefs {

    private WebDriver driver;

    @Given("I am on the {string} page")
    public void iAmOnThePage(String arg0) {
        driver = new ChromeDriver();
        driver.get("https://membership.basketballengland.co.uk/NewSupporterAccount");
    }

    @And("I set my date of birth to {string}")
    public void iSetMyDateOfBirthTo(String date) {
        driver.findElement(By.id("dp")).sendKeys(date);
    }

    @And("I enter {string} as my first name")
    public void iEnterAsMyFirstName(String name) {
        driver.findElement(By.id("member_firstname")).sendKeys(name);
    }

    @And("I enter {string} as my last name")
    public void iEnterAsMyLastName(String lastname) {
        driver.findElement(By.id("member_lastname")).sendKeys(lastname);
    }


    @And("I enter {string} as my email address")
    public void iEnterAsMyEmailAddress(String email) {
        driver.findElement(By.id("member_emailaddress")).sendKeys(email);
    }

    @And("I confirm my email address with {string}")
    public void iConfirmMyEmailAddressWith(String confirmemail) {
        driver.findElement(By.id("member_confirmemailaddress")).sendKeys(confirmemail);
    }

    @And("I enter {string} as my password")
    public void iEnterAsMyPassword(String password) {
        driver.findElement(By.id("signupunlicenced_password")).sendKeys(password);
    }

    @And("I confirm my password with {string}")
    public void iConfirmMyPasswordWith(String confirmpassword) {
        driver.findElement(By.id("signupunlicenced_confirmpassword")).sendKeys(confirmpassword);
    }

    @And("I agree to the terms and conditions")
    public void iAgreeToTheTermsAndConditions() {
        driver.findElement(By.cssSelector(".md-checkbox > .md-checkbox:nth-child(1) .box")).click();
    }

    @And("I verify that i am {int}")
    public void iVerifyThatIAm(int arg0) {
        driver.findElement(By.cssSelector(".md-checkbox:nth-child(2) > label > .box")).click();
    }

    @And("I agree to the code of ethics and conduct")
    public void iAgreeToTheCodeOfEthicsAndConduct() {
        driver.findElement(By.cssSelector(".md-checkbox:nth-child(7) .box")).click();
    }

    @When("I click the {string} button")
    public void iClickTheButton(String arg0) {
        driver.findElement(By.name("join")).click();
    }

    @Then("My account is created and verified with {string}")
    public void myAccountIsCreatedAndVerifiedWith(String text) {
        assertThat(driver.findElement(By.cssSelector(".bold:nth-child(1)")).getText(), is(text));
        driver.close();
    }

    @Then("My account creation should fail with the error message: {string}")
    public void myAccountCreationShouldFailWithTheErrorMessage(String textii) {
        assertThat(driver.findElement(By.cssSelector(".warning>span")).getText(),is(textii));
    }

    @Then("Account creation failure because I didnt confirm my password: {string}")
    public void accountCreationFailureBecauseIDidntConfirmMyPassword(String textiii) {
        assertThat(driver.findElement(By.cssSelector(".warning > span")).getText(), is(textiii));
    }

    @Then("Account creation failure because i didnt agree to t&c: {string}")
    public void accountCreationFailureBecauseIDidntAgreeToTC(String textiiii) {
        assertThat(driver.findElement(By.cssSelector(".warning > span")).getText(), is(textiiii));
    }

}
