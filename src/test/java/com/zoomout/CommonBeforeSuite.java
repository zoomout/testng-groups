package com.zoomout;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;

public interface CommonBeforeSuite {

    @BeforeSuite(alwaysRun = true)
    default void beforeSuite() {
        System.out.println("\nBEFORE SUITE\n");
    }

    @AfterSuite(alwaysRun = true)
    default void afterSuite() {
        System.out.println("AFTER SUITE\n");
    }

    @BeforeGroups(groups = "group1")
    default void  beforeGroup1() {
        System.out.println("   beforeGroup1");
    }

    @AfterGroups(groups = "group1")
    default void  afterGroup1() {
        System.out.println("   afterGroup1");
    }

    @BeforeGroups(groups = "group2")
    default void  beforeGroup2() {
        System.out.println("   beforeGroup2");
    }

    @AfterGroups(groups = "group2")
    default void  afterGroup2() {
        System.out.println("   afterGroup2");
    }

}
