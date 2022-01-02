package com.BasicSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoginPropTest
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fis= new FileInputStream("C:\\Users\\admin\\IdeaProjects\\Automationtesting\\src\\com\\BasicSeleniumTest\\config.Properties");
        Properties prop = new Properties();
        prop.load(fis);

        WebDriver driver;
        if (prop.getProperty("browser").equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver",prop.getProperty("chromeDriver"));

            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }else
        {
            driver= new FirefoxDriver();
        }

        driver.get(prop.getProperty("siteURl"));
        driver.findElement(By.id("email")).sendKeys("queuecodes@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("submit")).click();

        driver.findElement(By.id("hlogout")).click();
    }

}
