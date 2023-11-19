package com.prisca.classe;

import java.util.TreeSet;

/**
 * Represents an event queue that stores event points in a sorted order.
 */
public class EventQueue {
    private TreeSet<EventPoint> queue;

    /**
     * Constructs an empty EventQueue object.
     */
    public EventQueue() {
        this.queue = new TreeSet<>();
    }

    /**
     * Inserts an event point into the event queue.
     *
     * @param event The event point to be inserted.
     */
    public void insert(EventPoint event) {
        queue.add(event);
    }

    /**
     * Retrieves and removes the next event from the event queue.
     *
     * @return The next event point.
     */
    public EventPoint getNextEvent() {
        return queue.pollFirst();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
}
