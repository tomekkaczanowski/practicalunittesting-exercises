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
public class FirstTest {

    
    public void firstTestMethod() throws InterruptedException {
        waitAndFailOrPass();
    }

    public void secondTestMethod() throws InterruptedException {
        waitAndFailOrPass();
    }

    public void thirdTestMethod() throws InterruptedException {
        waitAndFailOrPass();
    }

    public void fourthTestMethod() throws InterruptedException {
        waitAndFailOrPass();
    }

    public void fifthTestMethod() throws InterruptedException {
        waitAndFailOrPass();
    }

}
