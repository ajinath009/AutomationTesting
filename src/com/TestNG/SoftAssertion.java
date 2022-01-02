package com.TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion
{
    @Test
    public void softAssert()
    {
        SoftAssert soft= new SoftAssert();
        System.out.println("11111");
        soft.assertEquals(5,4);
        System.out.println("55555");
        soft.assertEquals("java","java");
        soft.assertAll();

    }
}
