package com.GroupTest;

import org.testng.annotations.Test;

public class HomeLoan
{

    @Test
    public void WebLoginHL()
    {
        System.out.println("Home loan login on website....");
    }
    @Test(groups = {"Smoke Test"})
    public void MobileLoginHL()
    {
        System.out.println("Home loan login on mobile ....");
    }
    @Test
    public void APILoginHL()
    {
        System.out.println("Home loan login on API....");

    }
}
