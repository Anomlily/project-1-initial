package com.csc205.project1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void shiftX() {
        Point b = new Point(6.0, 5.0);

        b.shiftX(4);

        assertEquals(10.0, b.getX());
    }

    @Test
    void shiftY() {
        Point b = new Point(6.0, 5.0);

        b.shiftY(-2);

        assertEquals(3.0, b.getY());
    }

    @Test
    void distance() {
        Point b = new Point(0.0, 0.0);
        Point b2 = new Point(b.getX(), b.getY());

        b.shiftX(4);
        b.shiftY(-2);

        assertEquals(4.47213595499958, b.distance(b2));
    }

    @Test
    void rotate() {
        double rotation = Math.PI / 2.0;
        Point a = new Point(3.0, 1.0);

        assertEquals(1.5707963267948966, a.rotate(rotation));
    }
}