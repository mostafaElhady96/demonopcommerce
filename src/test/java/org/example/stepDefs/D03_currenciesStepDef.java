package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class D03_currenciesStepDef {
    P03_homePage home = new P03_homePage();

    @Then("i check euro applied successfully")
    public void checkeuro(){
    for (int i=0 ; i<home.prices().size();i++){
        String value = home.prices().get(i).getText();
        System.out.println(value);
        Assert.assertTrue(value.contains("€"));

    }
    }

    @When("user click on euro")
    public void userClickOnEuro() {
        Select selectcurrency = new Select(home.currency());
        selectcurrency.selectByVisibleText("Euro");

    }
}
