package com.zoomout;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1B extends Test1Common {

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodB() {
        System.out.println("    beforeMethod test1B");
    }

    @Test(groups = "group1")
    public void test1B_group1() {
        long id = Thread.currentThread().getId();
        System.out.println("      test1B Group1 Thread id is: " + id);
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethodB() {
        System.out.println("    afterMethod test1B");
    }

}
