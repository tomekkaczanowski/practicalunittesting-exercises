package com.practicalunittesting;

import org.testng.annotations.Test;

import static com.practicalunittesting.utils.TestListenerUtils.waitAndFailOrPass;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class SecondTest {

    
    public void methodA() throws InterruptedException {
        waitAndFailOrPass();
    }

    public void methodB() throws InterruptedException {
        waitAndFailOrPass();
    }

    public void methodC() throws InterruptedException {
        waitAndFailOrPass();
    }

    public void methodD() throws InterruptedException {
        waitAndFailOrPass();
    }

    public void methodE() throws InterruptedException {
        waitAndFailOrPass();
    }
}
