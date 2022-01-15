package com.GroupTest;

import org.testng.annotations.Test;

public class PersonalLoan
{
    @Test(groups = {"Smoke Test"})
    public void WebLoginPL()
    {
        System.out.println("Personal loan login on website....");
    }
    @Test()
    public void MobileLoginPL()
    {
        System.out.println("Personal loan login on mobile ....");
    }
    @Test()
    public void APILoginPL()
    {
        System.out.println("Personal loan login on API....");

    }
    /*
    @Test(priority = 4)
    public void Demo()
    {
        HomeLoan hl= new HomeLoan();
        hl.MobileLoginHL();
        hl.APILoginHL();
        hl.WebLoginHL();

    }

     */
}
