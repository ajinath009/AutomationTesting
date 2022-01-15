package com.GroupTest;

import org.testng.annotations.Test;

public class CarLoan
{

    @Test
    public void WebLoginCL()
    {
        System.out.println("Car loan login on website...");
    }
    @Test
    public void MobileLoginCL()
    {
        System.out.println("Car loan login on mobile ....");
    }
    @Test(groups = {"Smoke Test"})
    public void APILoginCL()
    {
        System.out.println("Car loan login on API...");

    }

}
