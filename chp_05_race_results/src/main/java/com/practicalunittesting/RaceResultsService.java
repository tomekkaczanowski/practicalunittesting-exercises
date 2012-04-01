package com.practicalunittesting;

import java.util.Collection;
import java.util.HashSet;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class RaceResultsService {

    private Collection<Client> clients = new HashSet<Client>();

    public void addSubscriber(Client client) {
        clients.add(client);
    }

    public void send(Message message) {
        for (Client client : clients) {
            client.receive(message);
        }
    }

    public void removeSubscriber(Client client) {
        clients.remove(client);
    }
}
