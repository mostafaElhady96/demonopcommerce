package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class hooks {

    public static WebDriver driver;

    @Before
    public static void openBrowser(){
    driver= new ChromeDriver();
    driver.manage().window().maximize();
    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @After
    public static void QuitDriver() throws InterruptedException {
    Thread.sleep(2000);
     driver.quit();

    }
}
