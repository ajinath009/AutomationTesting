package com.BasicSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsuluteXpath
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///C:/Users/admin/AppData/Local/Temp/Rar$EXa13900.30741/Offline%20Website/index.html");

        WebElement Email= driver.findElement(By.className("form-control"));
        Email.sendKeys("queuecodes@gmail.com");
        WebElement Pass = driver.findElement(By.id("password"));
        Pass.sendKeys("123456");
        WebElement submit= driver.findElement(By.className("btn"));
        submit.click();


    }
}
