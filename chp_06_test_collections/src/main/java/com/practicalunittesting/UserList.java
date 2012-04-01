package com.practicalunittesting;

import java.util.ArrayList;
import java.util.List;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class UserList {

    private List<User> users = new ArrayList<User>();

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
            users.add(user);
    }
}
