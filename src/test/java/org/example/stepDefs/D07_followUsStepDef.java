package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class D07_followUsStepDef {
    P03_homePage follow = new P03_homePage();


    @When("user click on facebook icon")
    public void userClickFacebook(){
        follow.facbookicon().click();
    }

    @And("user wait for loading of new window")
    public void userWaitForLoadingOfNewWindow() {
        WebDriverWait wait = new WebDriverWait(hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    }


    @Then("user found facebook page")
    public void userFoundFacebookPage() {
        List<String> tabs = new  ArrayList<>(hooks.driver.getWindowHandles());
        hooks.driver.switchTo().window(tabs.get(1));

        String ExpectedUrl="https://www.facebook.com/nopCommerce";
        Assert.assertTrue(hooks.driver.getCurrentUrl().contains(ExpectedUrl));
    }

    @When("user click on twitter icon")
    public void userClickOnTwitterIcon() {
        follow.twittericon().click();
    }

    @Then("user found twitter page")
    public void userFoundTwitterPage() {
        List<String> tabs = new  ArrayList<>(hooks.driver.getWindowHandles());
        hooks.driver.switchTo().window(tabs.get(1));

        String ExpectedUrl="https://twitter.com/nopCommerce";
        Assert.assertTrue(hooks.driver.getCurrentUrl().contains(ExpectedUrl));
    }

    @When("user click on rss icon")
    public void userClickOnRssIcon() {
        follow.rssicon().click();
    }

    @Then("user found rss page")
    public void userFoundRssPage() {
        List<String> tabs = new  ArrayList<>(hooks.driver.getWindowHandles());
        hooks.driver.switchTo().window(tabs.get(1));
        System.out.println(hooks.driver.getCurrentUrl());
    }

    @When("user click on youtube icon")
    public void userClickOnYoutubeIcon() {
        follow.youtubeicon().click();
    }

    @Then("user found youtube page")
    public void userFoundYoutubePage() throws InterruptedException {
        List<String> tabs = new  ArrayList<>(hooks.driver.getWindowHandles());
        hooks.driver.switchTo().window(tabs.get(1));

        String ExpectedUrl="https://www.youtube.com/user/nopCommerce";
        Assert.assertTrue(hooks.driver.getCurrentUrl().contains(ExpectedUrl));
    }

}
