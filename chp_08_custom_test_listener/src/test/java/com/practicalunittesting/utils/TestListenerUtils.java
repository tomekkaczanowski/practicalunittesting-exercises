package com.practicalunittesting.utils;

import org.testng.ITestResult;

import static org.testng.Assert.fail;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class TestListenerUtils {

    public static void waitAndFailOrPass() throws InterruptedException {
        Thread.sleep((long) (Math.random() * 5000));
        if (Math.random() > 0.8) {
            fail();
        }
    }

}
