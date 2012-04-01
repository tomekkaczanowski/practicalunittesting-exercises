package com.practicalunittesting;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.Mockito.*;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class RaceResultsServiceTest {

    private RaceResultsService raceResults;
    private Client clientA, clientB;
    private Message message;

    @BeforeMethod
    public void setUp() {
        raceResults = new RaceResultsService();
        clientA = mock(Client.class);
        clientB = mock(Client.class);
        message = mock(Message.class);
    }

    public void notSubscribedClientShouldNotReceiveMessage() {
        raceResults.send(message);
        verify(clientA, never()).receive(message);
        // verify(clientA).receive(message);
        verify(clientB, never()).receive(message);
    }

    public void subscribedClientShouldReceiveMessage() {
        raceResults.send(message);
        verify(clientA, never()).receive(message);
        verify(clientB, never()).receive(message);

        raceResults.addSubscriber(clientA);
        raceResults.send(message);
        verify(clientA).receive(message);
    }

    public void allSubscribedClientsShouldReceiveMessages() {
        raceResults.addSubscriber(clientA);
        raceResults.addSubscriber(clientB);
        raceResults.send(message);
        verify(clientA).receive(message);
        verify(clientB).receive(message);
    }

    public void shouldSendOnlyOneMassageToMultiSubscriber() {
        raceResults.addSubscriber(clientA);
        raceResults.addSubscriber(clientA);
        raceResults.send(message);
        //verify(clientA, times(1)).receive(message); // same as below - times(1) is the default
        verify(clientA).receive(message);
    }

    public void unsubscribedClientShouldNotReceiveMessages() {
        raceResults.addSubscriber(clientA);
        raceResults.removeSubscriber(clientA);
        raceResults.send(message);
        verify(clientA, never()).receive(message);
    }
}

