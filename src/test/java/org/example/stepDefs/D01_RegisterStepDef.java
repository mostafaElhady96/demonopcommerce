package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_RegisterStepDef {
    P01_register register = new P01_register();

    @Given("user go to register page")
    public void user_go_to_register_page()
    {
       register.registerlink().click();
    }

    @When("user select gender type")
    public void gender()
    {
     register.gendermale().click();
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() throws InterruptedException {
        // Locate the date of birth elements
        WebElement Day = hooks.driver.findElement(By.name("DateOfBirthDay"));
        WebElement Month = hooks.driver.findElement(By.name("DateOfBirthMonth"));
        WebElement Year = hooks.driver.findElement(By.name("DateOfBirthYear"));

        // Use Select class to interact with dropdowns
        Select daySelect = new Select(Day);
        Select monthSelect = new Select(Month);
        Select yearSelect = new Select(Year);

        // Select the date of birth
        daySelect.selectByValue("1");
        monthSelect.selectByValue("5");
        yearSelect.selectByVisibleText("1993");
    }

    @And("user click on register button")
    public void userClickOnRegisterButton() {
        register.registerButton().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() throws InterruptedException {
        SoftAssert soft = new SoftAssert();

        soft.assertTrue(register.continueButton().isDisplayed());
        soft.assertTrue(register.continueButton().isEnabled());
        System.out.println("success assertion about continue button");

        String Expectedresult ="Your registration completed";
        String acutal =register.registrationResult().getText();
        soft.assertTrue(acutal.contains(Expectedresult));
        System.out.println("success assertion about text in registration ");
        soft.assertAll();
    }

    @And("user enter {string} as username and {string} as lastname")
    public void userEnterAsUsernameAndAsLastname(String arg0, String arg1) {
        register.firstName().sendKeys(arg0);
        register.lastName().sendKeys(arg1);
    }

    @And("user fill {string} as paswword and {string} as confirmpassword field")
    public void userFillAsPaswwordAndAsConfirmpasswordField(String arg0, String arg1) {
        register.password().sendKeys(arg0);
        register.confirmPassword().sendKeys(arg1);
    }

    @And("user enter enter {string} in email field")
    public void userEnterEnterInEmailField(String emailm) {
        register.email().sendKeys(emailm);
        System.out.println("success");
    }

}
