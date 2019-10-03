package com.zoomout;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test1A extends Test1Common {

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodA() {
        System.out.println("    beforeMethod test1A");
    }

    @Test(groups = "group1")
    public void test1A_group1() {
        long id = Thread.currentThread().getId();
        System.out.println("      test1A Group1 Thread id is: " + id);
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(1 ,1);
        sa.assertEquals(2 ,2);
        sa.assertAll("Something failed");
    }

    @AfterMethod(alwaysRun = true)
    public void  afterMethodA() {
        System.out.println("    afterMethod test1A");
    }

}
