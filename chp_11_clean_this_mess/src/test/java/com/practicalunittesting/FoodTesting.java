package com.practicalunittesting;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class FoodTesting {

    public void testFridge() {
        Fridge fridge = new Fridge();

        fridge.put("cheese");
        assertEquals(fridge.contains("cheese"), true);
        assertEquals(fridge.put("cheese"), false);
        assertEquals(fridge.contains("cheese"), true);

        assertEquals(fridge.contains("ham"), false);

        fridge.put("ham");
        assertEquals(fridge.contains("cheese"), true);
        assertEquals(fridge.contains("ham"), true);

        try {
            fridge.take("sausage");
            fail("There was no sausage in the fridge!");
        }
        catch(NoSuchItemException e) {
            // ok
        }

    }
    public void testPutTake() {
        Fridge fridge = new Fridge();
        List<String> food = new ArrayList<String>();
        food.add("yogurt");
        food.add("milk");
        food.add("eggs");
        for (String item : food) {
            fridge.put(item);
            assertEquals(fridge.contains(item), true);
            fridge.take(item);
            assertEquals(fridge.contains(item), false);
        }
        
        for (String item : food) {
            try {
                fridge.take(item);
                fail("there was no " + item + " in the fridge");
            }
            catch(NoSuchItemException e) {
                assertEquals(e.getMessage().contains(item), true);
            }
        }
    }
}
