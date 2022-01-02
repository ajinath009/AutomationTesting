package com.BasicSeleniumTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScenario
{
    public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///C:/Users/admin/AppData/Local/Temp/Rar$EXa13900.30741/Offline%20Website/index.html");
        WebElement Email= driver.findElement(By.xpath("//*[@id=\"email\"]"));
        Email.sendKeys("queuecodes@gmail.com");
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        pass.sendKeys("123456");
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        submit.click();

        driver.findElement(By.xpath("//a[@href='users.html']")).click();
        driver.findElement(By.id("default-user")).click();

        Alert art= driver.switchTo().alert();
        System.out.println("Alert Text:"+art.getText());
        art.accept();

        Thread.sleep(5000);
        driver.close();



    }
}
