package org.example.pages;

import io.cucumber.messages.types.Hook;
import org.example.stepDefs.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {
    public WebElement registerlink(){
        return hooks.driver.findElement(By.className("ico-register"));

    }

    public WebElement gendermale()
    {
        return hooks.driver.findElement(By.id("gender-male"));
    }
    public WebElement genderfemale()
    {
        return hooks.driver.findElement(By.id("gender-female"));
    }

    public WebElement firstName()
    {
        return hooks.driver.findElement(By.id("FirstName"));

    }

    public WebElement lastName()
    {
        return hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement email ()
    {
        return hooks.driver.findElement(By.id("Email"));
    }

    public WebElement companyname (){
        return hooks.driver.findElement(By.id("Company"));
    }

    public WebElement newsletter(){
        return hooks.driver.findElement(By.id("Newsletter"));
    }

    public WebElement password(){
        return hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirmPassword(){
        return hooks.driver.findElement(By.id("ConfirmPassword"));

    }

    public WebElement registerButton(){
        return hooks.driver.findElement(By.id("register-button"));
    }

    public WebElement continueButton(){
        return hooks.driver.findElement(By.className("button-1"));
    }

    public WebElement registrationResult(){
        return hooks.driver.findElement(By.className("result"));
    }

}



