package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D06_homeSlidersStepDef {
    P03_homePage slider = new P03_homePage();

    @When("User click on first slider")
    public void userClickFirst(){
        slider.firstSlideButton().click();
        slider.firstSlide().click();

    }

    @Then("user found item of first slide successfully")
    public void userFoundItemSuccessfully() {
        String expectedUrl = "https://demo.nopcommerce.com/";
        String currentUrl= hooks.driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertTrue(currentUrl.contains(expectedUrl));
    }

    @When("user click on slider button")
    public void userClickOnSliderButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(hooks.driver, Duration.ofSeconds(10));
        slider.secondSlideButton().click();
        wait.until(ExpectedConditions.visibilityOf(slider.secondSlide()));
        slider.secondSlide().click();
    }

    @And("wait for page loading")
    public void waitForPageLoading() {

        System.out.println("ski[asd");
    }

    @Then("user found item of second slide successfully")
    public void userFoundItemOfSecondSlideSuccessfully() {
        String exoectedUrlSeconslide = "https://demo.nopcommerce.com/";
        String ActualUrlSecondSlide = hooks.driver.getCurrentUrl();
        Assert.assertTrue(ActualUrlSecondSlide.contains(exoectedUrlSeconslide));
    }
}
