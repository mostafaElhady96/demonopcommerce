package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class D05_hoverCategoriesStepDef {
    P03_homePage hover = new P03_homePage();
    Actions actions = new Actions(hooks.driver);
    public static int selectedcatagory;
    int selectedsubcatagory;
    List<WebElement> subcatagorylinks;
    SoftAssert soft = new SoftAssert();
    String locator ;
    String subcatagorytext;
    String maincatagorytext;

    @Given("select one of three main category")
    public void selectone() throws InterruptedException {
        int count = hover.maincategory().size();
        int min = 0 ;
        int max = count-1;
        selectedcatagory = (int) Math.floor(Math.random()*(max-min+1)+min);
        actions.moveToElement(hover.maincategory().get(selectedsubcatagory)).perform();
        maincatagorytext= hover.maincategory().get(selectedcatagory).getText();
        System.out.println("main category is selected " +maincatagorytext );

        Thread.sleep(3000);
    }
    @And("User can select on of sub category if exist")
    public void userCanSelectOnOfSubCategoryIfExist() {
    }

    @Then("sub-category title equals the one you get it while selecting random sub-categor")
    public void subCategoryTitleEqualsTheOneYouGetItWhileSelectingRandomSubCategor() {

    }


}

