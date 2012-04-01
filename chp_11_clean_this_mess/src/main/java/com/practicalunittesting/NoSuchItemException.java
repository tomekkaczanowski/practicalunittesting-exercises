package com.practicalunittesting;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class NoSuchItemException extends RuntimeException {
    public NoSuchItemException(String errorMsg) {
        super(errorMsg);
    }
}
