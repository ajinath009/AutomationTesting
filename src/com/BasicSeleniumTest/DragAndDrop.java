package com.BasicSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();

        WebElement frame= driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frame);

        WebElement Sourec = driver.findElement(By.id("draggable"));
        WebElement target= driver.findElement(By.id("droppable"));

        Actions ac = new Actions(driver);
        Action action = ac.dragAndDrop(Sourec,target).build();

        action.perform();



        Thread.sleep(5000);

        driver.close();


    }
}
