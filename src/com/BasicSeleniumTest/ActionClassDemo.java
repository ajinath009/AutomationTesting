package com.BasicSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class ActionClassDemo
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        driver.get("file:///C:/Users/admin/AppData/Local/Temp/Rar$EXa13900.30741/Offline%20Website/index.html");

        WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
        Actions as= new Actions(driver);

        Action action= as.moveToElement(email)
                        .click()
                           .keyDown(Keys.SHIFT)
                             .sendKeys("queuecodes@gmail.com")
                               .doubleClick()

                                 .contextClick()
                                   .build();

         action.perform();

        Thread.sleep(5000);

        driver.close();

    }
}
