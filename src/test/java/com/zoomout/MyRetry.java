package com.zoomout;

import org.testng.ITestResult;
import org.testng.util.RetryAnalyzerCount;

public class MyRetry extends RetryAnalyzerCount {

    public MyRetry() {
        setCount(3);
    }

    @Override
    public boolean retryMethod(ITestResult iTestResult) {
        return !iTestResult.isSuccess();
    }
}
