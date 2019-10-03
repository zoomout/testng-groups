package com.zoomout;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1A extends Test1Common {

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodA() {
        System.out.println("    beforeMethod test1A");
    }

    @Test(groups = "group1")
    public void test1A_group1() {
        System.out.println("      test1A Group1");
    }

    @AfterMethod(alwaysRun = true)
    public void  afterMethodA() {
        System.out.println("    afterMethod test1A");
    }

}
