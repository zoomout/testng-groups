package com.zoomout;

import org.testng.annotations.*;

import java.util.function.Supplier;

public class Test3 implements CommonBeforeSuite {

    @BeforeClass(alwaysRun = true)
    public void beforeClass3() {
        System.out.println("  beforeClass Test3");
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod3() {
        System.out.println("    beforeMethod test3");
    }

    @DataProvider
    public Object[][] datProvider3() {
        System.out.println("   datProvider test3");
        return new Object[][]{
                {(Supplier<Integer>) () -> getData(1)},
                {(Supplier<Integer>) () -> getData(2)},
        };
    }

    private int getData(int i) {
        if (i == 1) {
            return 1;
        } else {
            throw new RuntimeException("o-oh");
        }
    }

    @Test(groups = "group3", dataProvider = "datProvider3")
    public void test3_group3(Supplier<Integer> iSupplier) {
        long id = Thread.currentThread().getId();
        System.out.println("      test3 Group3 " + iSupplier.get() + " Thread id is: " + id);
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod3() {
        System.out.println("    afterMethod test3");
    }

    @AfterClass(alwaysRun = true)
    public void afterClass3() {
        System.out.println("  afterClass Test3\n");
    }
}
