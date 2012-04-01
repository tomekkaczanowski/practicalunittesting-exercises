package com.practicalunittesting;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class AtomicIdGenerator implements IdGenerator {

	private static Long nextId = System.currentTimeMillis();

	public Long nextId() {
		return nextId++;
	}
}
