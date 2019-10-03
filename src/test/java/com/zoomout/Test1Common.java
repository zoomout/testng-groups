package com.zoomout;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Test1Common implements CommonBeforeSuite {


    @BeforeClass(alwaysRun = true)
    public void beforeClass1() {
        System.out.println("  beforeClass Test1Common");
    }

    @AfterClass(alwaysRun = true)
    public void afterClass1() {
        System.out.println("  afterClass Test1Common\n");
    }


}
