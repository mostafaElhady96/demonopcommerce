package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D08_WishlistStepDef {
    P03_homePage wish = new P03_homePage();


    @And("choose item to add to wishlist")
    public void chooseItem() throws InterruptedException {
        wish.htcItemwishlist().click();
    }

    @Then("success message of adding item to wishlist")
    public void successMesssageOfAddingItemToWhislist() {
        System.out.println(wish.wishlistMessage());
        Assert.assertTrue(wish.wishlistMessage().contains("The product has been added to your wishlist"));

    }

    @And("wait for message disappear")
    public void waitForMessageDisapear() {
        WebDriverWait wait = new WebDriverWait(hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(wish.WishlistMessageWebelent()));

    }

    @And("go to wishlist")
    public void goToWhishlist() {
       wish.wishlistbtn().click();
    }

    @Then("user found Qty value bigger than zero")
    public void userFoundQtyValueBiggerThanZero() {
        String numberofItems = wish.QTY().getAttribute("value");
        Assert.assertNotEquals("0", numberofItems);

    }
}
