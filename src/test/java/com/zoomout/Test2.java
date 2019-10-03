package com.zoomout;

import org.testng.annotations.*;

public class Test2 implements CommonBeforeSuite {

    @BeforeClass(alwaysRun = true)
    public void beforeClass2() {
        System.out.println("  beforeClass Test2");
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod2() {
        System.out.println("    beforeMethod test2");
    }

    @DataProvider
    public Object[][] datProvider2() {
        System.out.println("   datProvider test2");
        return new Object[][]{
                {1},
                {2},
        };
    }

    @Test(groups = "group2", dataProvider = "datProvider2")
    public void test2_group2(int i) {
        System.out.println("      test2 Group2 " + i);
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod2() {
        System.out.println("    afterMethod test2");
    }

    @AfterClass(alwaysRun = true)
    public void afterClass2() {
        System.out.println("  afterClass Test2\n");
    }
}
