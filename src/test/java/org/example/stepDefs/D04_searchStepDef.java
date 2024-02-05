package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.security.Key;
import java.util.List;
import java.util.Locale;

public class D04_searchStepDef {
    P03_homePage home = new P03_homePage();

    @Given("user go to homepage")
    public void homepage(){
        hooks.driver.get("https://demo.nopcommerce.com/");
    }

    @Then("search result contains {string}")
    public void searchResultCintains(String productname) {
        SoftAssert soft = new SoftAssert();
        String actualUrl= hooks.driver.getCurrentUrl();
        String expectedUrl ="https://demo.nopcommerce.com/search?q";
       // soft.assertTrue(expectedUrl.contains(actualUrl));
        soft.assertTrue(actualUrl.contains(expectedUrl));
        //System.out.println("url assertion passed");


        int searchresultnumber =hooks.driver.findElements(By.className("product-title")).size();
        //System.out.println(searchresultnumber);
        soft.assertTrue(searchresultnumber > 0,"no search result found ");
       // System.out.println("serach result number passed");
        
        List<WebElement>searchResult = hooks.driver.findElements(By.className("product-title"));

        for (int i = 0; i<searchresultnumber ; i++) {
          /*  System.out.println(searchResult.get(i).getText().toLowerCase());
            System.out.println("//////////////////");
            System.out.println(productname.toLowerCase());*/
            soft.assertTrue(searchResult.get(i).getText().toLowerCase()
                    .contains(productname.toLowerCase(Locale.ROOT)));
            System.out.println(productname);
        }
        soft.assertAll();
    }
    @When("user click enter")
    public void userClickEnter() {
        home.searchfield().sendKeys(Keys.ENTER);
    }


    @And("enter {string}")
    public void enter(String productname) {
        System.out.println(productname);
        home.searchfield().sendKeys(productname);
    }

    @And("enter serial {string}")
    public void enterSerial(String sku) {
        home.searchfield().sendKeys(sku);
    }

    @Then("user found items with {string} serial successfully")
    public void userFoundItemsWithSuccessfully(String sku) {
        System.out.println(sku);

        SoftAssert soft = new SoftAssert();
        String actualUrl= hooks.driver.getCurrentUrl();
        String expectedUrl ="https://demo.nopcommerce.com/search?q";
        // soft.assertTrue(expectedUrl.contains(actualUrl));
        soft.assertTrue(actualUrl.contains(expectedUrl));
        System.out.println("url assertion passed");


        int searchresultnumber =hooks.driver.findElements(By.className("product-title")).size();
        System.out.println(searchresultnumber);
        soft.assertTrue(searchresultnumber < 2);
        System.out.println("serach result number passed");


        WebElement searhresult =
                hooks.driver.findElement(By.
                        xpath("/html/body/div[6]/div[3]/div/" +
                                "div[2]/div/div[2]/div[3]/" +
                                "div/div[2]/div/div/div/div/div[1]/a/img"));
        searhresult.click();
        WebElement value = hooks.driver.findElement(By.className("value"));


        soft.assertTrue(value.getText().contains(sku));

        soft.assertAll();
    }


    }

