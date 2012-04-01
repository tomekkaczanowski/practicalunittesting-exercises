package com.practicalunittesting;

import org.testng.annotations.Test;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class OperatingSystemTest {
    
    private OperatingSystem os;
    
    public void testUsingMatcher() {
        os = new OperatingSystem();
        os.setNbOfBits(64);
        os.setReleaseYear(2007);

        //TODO this is what we would like to have
        //assertThat(os).is64bit().wasReleasedIn(2003);
    }
}
