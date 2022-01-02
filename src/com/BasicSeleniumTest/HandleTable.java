package com.BasicSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandleTable

{
    /*
    Ajinath khedkar is user
     */
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

        driver.get("file:///C:/Users/admin/AppData/Local/Temp/Rar$EXa13900.30741/Offline%20Website/index.html");

        WebElement Email = driver.findElement(By.className("form-control"));
        Email.sendKeys("queuecodes@gmail.com");
        WebElement Pass = driver.findElement(By.id("password"));
        Pass.sendKeys("123456");
        WebElement submit = driver.findElement(By.className("btn"));
        submit.click();

        WebElement User = driver.findElement(By.xpath("//*[@id=\"Users\"]/a"));
        User.click();
          driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
        WebElement table= driver.findElement(By.className("table"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (WebElement row: rows)
        {
            List<WebElement> coloum = row.findElements(By.tagName("td"));
            for (WebElement col : coloum)
            {
                System.out.println(col.getText());
            }
            System.out.println("............................");

            System.out.println("test run successfully.....");

        }
        driver.close();


    }
}

