package org.example.pages;

import org.example.stepDefs.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {

    public WebElement emailfield(){
        return hooks.driver.findElement(By.id("Email"));
    }
    public  WebElement passwordfield(){
        return hooks.driver.findElement(By.id("Password"));
    }

    public WebElement loginButton(){
        return hooks.driver.findElement(By.className("login-button"));
    }

    public WebElement myaccontTab(){
        return hooks.driver.findElement(By.className("ico-account")) ;
    }
}
