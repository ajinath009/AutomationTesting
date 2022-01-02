package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class TestCaseLogin
{
    WebDriver driver;
    WebElement email,pass,submit,logout;
     SoftAssert soft = new SoftAssert();

    @BeforeSuite
    public void doSetup()
    {
          System.setProperty("webdriver.chrome.driver","chromedriver.exe");
          driver = new ChromeDriver();
          driver.manage().window().maximize();
    }
    @BeforeTest
    public void launchSite()
    {
        driver.get("file:///C:/Users/admin/AppData/Local/Temp/Rar$EXa13900.30741/Offline%20Website/index.html");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

    }
    @BeforeMethod
    public void getXpath()
    {
        email= driver.findElement(By.xpath("//*[@id=\"email\"]"));
        pass= driver.findElement(By.xpath("//*[@id=\"password\"]"));
        submit= driver.findElement(By.xpath("//*[@id=\"submit\"]"));
    }

    @Test
    public void LoginTest()
    {
        email.sendKeys("queuecodes@gmail.com");
        pass.sendKeys("123456");
        submit.click();
    }

    @AfterMethod
    public void doAsset()
    {
        String title = driver.getTitle();
        soft.assertEquals(title,"Queue Codes | Dashboard");

        System.out.println("Assert successfully...");

    }
    @AfterTest
    public void doLogout()
    {
        logout= driver.findElement(By.id("hlogout"));
        logout.click();
    }
    @AfterSuite
    public void TearDown()
    {
        driver.close();
        soft.assertAll();

        System.out.println("TESTCASE ARE EXECUTE SUCCESSFULLY.....");
    }


}
