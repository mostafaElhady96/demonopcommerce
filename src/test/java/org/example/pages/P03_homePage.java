package org.example.pages;

import org.example.stepDefs.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {

    public WebElement searchfield(){
        return hooks.driver.findElement(By.id("small-searchterms"));

    }
    public WebElement currency(){
        return hooks.driver.findElement(By.id("customerCurrency"));
    }
    public List<WebElement> prices(){
      return hooks.driver.findElements(By.className("actual-price"));
    }

    // f06 home slider
    public WebElement firstSlide(){
        return hooks.driver.findElement(By.className("nivo-imageLink"));
    }
    public WebElement firstSlideButton(){
        return hooks.driver.findElement(By.xpath(".//a[@rel='0']"));
    }

    public WebElement secondSlideButton(){
        return hooks.driver.findElement(By.xpath(".//a[@rel='1']"));
    }

    public WebElement secondSlide(){
        return hooks.driver.findElement(By.className("nivo-imageLink"));
    }


    public WebElement facbookicon(){
        return hooks.driver.findElement(By.className("facebook"));
    }
    public WebElement twittericon(){
        return hooks.driver.findElement(By.className("twitter"));
    }

    public WebElement rssicon(){
        return hooks.driver.findElement(By.className("rss"));
    }
    public WebElement youtubeicon(){
        return hooks.driver.findElement(By.className("youtube"));

    }
    public WebElement htcItemwishlist(){
        return hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]" +
                "/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
    }

    public WebElement giftCardWishlist(){
        return hooks.driver.findElement(By.xpath("\n" +
                "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]" +
                "/div[4]/div/div[2]/div[3]/div[2]/button[3]"));
    }

    public String wishlistMessage(){
        return hooks.driver.findElement(By.className("content")).getText();
    }

    public WebElement WishlistMessageWebelent(){
        return hooks.driver.findElement(By.className("content"));
    }

    public WebElement wishlistbtn(){
        return  hooks.driver.findElement(By.className("ico-wishlist"));
    }
    public WebElement QTY (){
        return hooks.driver.findElement(By.className("qty-input"));
    }


}

