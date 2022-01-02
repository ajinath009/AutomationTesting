package com.BasicSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.File;

public class TakeSceenshotDemo
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("file:///C:/Users/admin/AppData/Local/Temp/Rar$EXa13900.30741/Offline%20Website/index.html");
        driver.manage().window().maximize();
        WebElement Email= driver.findElement(By.xpath("//*[@id=\"email\"]"));
         Email.sendKeys("queuecodes@gmail.com");

        WebElement Pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
              Pass.sendKeys("123451");

              WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
              submit.click();
        EventFiringWebDriver event = new EventFiringWebDriver(driver);

        File source = event.getScreenshotAs(OutputType.FILE);
        File target = new File("C:/Users/admin/IdeaProjects/Automationtesting/src/resource/snap.jpg");

driver.close();

    }
}
