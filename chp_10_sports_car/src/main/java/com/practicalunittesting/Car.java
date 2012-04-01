package com.practicalunittesting;

import java.awt.*;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public interface Car {
    
    Engine getEngine();
    
    Color getColor();

    Manufacturer getManufacturer();
}
