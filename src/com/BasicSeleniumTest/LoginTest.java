package com.BasicSeleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.get("file:///C:/Users/admin/AppData/Local/Temp/Rar$EXa13900.30741/Offline%20Website/index.html");

        WebElement Email= driver.findElement(By.xpath("//*[@id=\"email\"]"));
        Email.sendKeys("queuecodes@gmail.com");
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        pass.sendKeys("123456");
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        submit.click();

        String actualResult = driver.getTitle();
        if(actualResult.equals("Queue Codes | Dashboard"))
        {
            System.out.println("Test case is passed...");
        }
        else
        {
            System.out.println("Test case is failed....");
        }
        WebElement Logout= driver.findElement(By.xpath("//*[@id=\"hlogout\"]/a"));
        Logout.click();
        System.out.println("logout successfully....");

       Thread.sleep(500);

        //driver.close();


    }
}
