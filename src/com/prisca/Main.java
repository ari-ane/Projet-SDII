package com.prisca;

import com.prisca.classe.*;

public class Main {

    public static void main(String[] args) {
        EventQueue eventQueue = new EventQueue();

        EventPoint event1 = new EventPoint(1.5, 2.0);
        EventPoint event2 = new EventPoint(2.0, 1.5);
        EventPoint event3 = new EventPoint(1.0, 2.0);

        eventQueue.insert(event3);
        eventQueue.insert(event1);
        eventQueue.insert(event2);


        EventPoint nextEvent = eventQueue.getNextEvent();
        System.out.println("Next event: (" + nextEvent.getX() + ", " + nextEvent.getY() + ")");

    }
}
