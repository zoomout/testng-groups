package com.zoomout;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1C extends Test1Common {

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodC() {
        System.out.println("    beforeMethod test1C");
    }

    @Test(groups = "group2")
    public void test1C_group2() {
        System.out.println("      test1C Group2");
    }

    @AfterMethod(alwaysRun = true)
    public void  afterMethodC() {
        System.out.println("    afterMethod test1C");
    }

}
