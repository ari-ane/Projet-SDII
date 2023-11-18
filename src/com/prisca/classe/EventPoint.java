package com.prisca.classe;

/**
 * Represents an event point with x and y coordinates.
 */
public class EventPoint  implements Comparable<EventPoint>{
        private double x;
        private double y;

        /**
         * Constructs an EventPoint object with the specified coordinates.
         *
         * @param x The x-coordinate of the event point.
         * @param y The y-coordinate of the event point.
         */
        public EventPoint(double x, double y) {
            this.x = x;
            this.y = y;
        }

        /**
         * Returns the x-coordinate of the event point.
         *
         * @return The x-coordinate.
         */
        public double getX() {
            return x;
        }

        /**
         * Returns the y-coordinate of the event point.
         *
         * @return The y-coordinate.
         */
        public double getY() {
            return y;
        }

        @Override
        public int compareTo(EventPoint other) {
            if (this.y < other.y) {
                return -1;
            } else if (this.y > other.y) {
                return 1;
            } else {
                if (this.x < other.x) {
                    return -1;
                } else if (this.x > other.x) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }



}
