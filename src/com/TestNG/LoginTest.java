
package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class LoginTest
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
            driver.get("file:///C:/Users/admin/AppData/Local/Temp/Rar$EXa16432.25214/Offline%20Website/index.html");
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        }
        @BeforeMethod
        public void getXpath()
        {
            WebElement Email= driver.findElement(By.xpath("//*[@id=\"email\"]"));
            Email.sendKeys("queuecodes@gmail.com");
            WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
            pass.sendKeys("123456");
            WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
            submit.click();
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


