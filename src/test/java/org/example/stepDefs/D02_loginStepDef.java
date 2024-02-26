package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login = new P02_login();

    @Given("user go to login page")
    public void user_go_to_login_page(){
        hooks.driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }


    @And("user login with valid {string} in email field  and {string} in passwordfield")
    public void userLoginWithValidInEmailFieldAndInPasswordfield(String arg0, String arg1) {
        login.emailfield().sendKeys(arg0);
        login.passwordfield().sendKeys(arg1);
    }
    @When("user press on login button")
    public void userPressOnLoginButton() {
    login.loginButton().click();
    }


    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert soft = new SoftAssert();
        System.out.println(hooks.driver.getCurrentUrl());
        String actualUrl =hooks.driver.getCurrentUrl();
        String expectedUrl="https://demo.nopcommerce.com/";
        soft.assertTrue(expectedUrl.contains(actualUrl),"url is not right ");
        soft.assertTrue(login.myaccontTab().isEnabled());
        System.out.println(login.myaccontTab().isEnabled());
        soft.assertAll();
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {

       String currentUrl= hooks.driver.getCurrentUrl();
        System.out.println("url of invalid scenario"+ currentUrl);
        System.out.println(hooks.driver.getCurrentUrl());
        String errormessage= hooks.driver.findElement(By.className("validation-summary-errors")).getText();
        System.out.println("errormessage of invalid scenario "+errormessage);

    }



    @And("user login with {string} and {string}")
    public void userLoginWithAnd(String invalidemail, String password) {
        login.emailfield().sendKeys(invalidemail);
        login.passwordfield().sendKeys(password);
    }




}
