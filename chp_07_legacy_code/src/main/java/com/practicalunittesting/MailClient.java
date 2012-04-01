package com.practicalunittesting;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MailClient {
    
    public void sendEmail(String address, String title, String body) {
        Email email = new Email(address, title, body);
        EmailServer.sendEmail(email);
    }
}
