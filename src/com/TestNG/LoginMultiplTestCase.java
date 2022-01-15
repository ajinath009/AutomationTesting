package com.TestNG;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginMultiplTestCase
{
    WebDriver driver;

     @Test
    public void LogoTest() throws InterruptedException
     {
         System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
         driver=new ChromeDriver();
         driver.get("https://opensource-demo.orangehrmlive.com/");
         WebElement logo= driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));

         Assert.assertTrue(logo.isDisplayed());
         Thread.sleep(5000);

     }
     @Test
    public void HomepageTitle() throws InterruptedException
     {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
         driver=new ChromeDriver();
         driver.get("https://opensource-demo.orangehrmlive.com/");

         Assert.assertEquals(driver.getTitle(),"OrangeHRM");
         Thread.sleep(5000);
     }

     @Test
     public void doLogin()
     {

         System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
         driver=new ChromeDriver();
         driver.get("https://opensource-demo.orangehrmlive.com/");

         WebElement email= driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
         email.sendKeys("Admin");
         WebElement pass= driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
         pass.sendKeys("admin123");
         WebElement login = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
         login.click();

         System.out.println("LogIn successfull...");

     }
     @Test
     public void doOpration()
     {
         WebElement asign = driver.findElement(By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[1]/div/a/img"));
            asign.click();
            WebElement name= driver.findElement(By.xpath("//*[@id=\"assignleave_txtEmployee_empName\"]"));
            name.sendKeys("Prajakta Dhumal");



     }

     @AfterTest
    public void TearDown()
     {
         driver.quit();
     }


}
