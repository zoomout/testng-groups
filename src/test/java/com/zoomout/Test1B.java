package com.zoomout;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1B extends Test1Common {

    @BeforeMethod(alwaysRun = true)
    public void beforeMethodB() {
        System.out.println("    beforeMethod test1B");
    }

    private static int counter = 0;

    @Test(groups = "group1", retryAnalyzer = MyRetry.class)
    public void test1B_group1() {
        long id = Thread.currentThread().getId();
        if (counter++ < 2) {
            Assert.fail("Failing " + counter);
        }
        System.out.println("      test1B Group1 Thread id is: " + id);
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethodB() {
        System.out.println("    afterMethod test1B");
    }

}