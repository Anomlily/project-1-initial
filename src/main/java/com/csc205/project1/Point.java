package com.csc205.project1;

// This Program creates points that represent a location in the Cartesian plane.

public class Point {

    double x;
    double y;
    double distance;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        setPoint(x, y);
    }

    // setX(double x), setY(double y), setPoint(double x, double y) - set the coordinates of the point.
    public void setX(double x) {

        this.x = x;
    }

    public void setY(double y) {

        this.y = y;
    }

    public void setPoint(double x, double y) {
        setX(x);
        setY(y);

    }

    public double getX() {

        return this.x;
    }

    public double getY() {
        return this.y;
    }

    // shiftX(double n), shiftY(double n) - shift a point by a given amount along one of the axes.
    public void shiftX(double n) {
        this.x = this.x + n;

    }

    public void shiftY(double n) {
        this.y = this.y + n;

    }

    // distance(Point p2) - finds the distance to point p2.
    public double distance(Point p2) {
        this.distance = Math.sqrt(Math.pow(p2.getX() - x, 2) + Math.pow(p2.getY() - y, 2));

        return distance;
    }

    // rotate(double angle) - rotates the point by a specified angle around the origin.
    public double rotate(double angle) {
        this.x = (this.x * Math.cos(angle)) - (this.y * Math.sin(angle));
        this.y = (this.x * Math.sin(angle)) + (this.y * Math.cos(angle));
        return angle;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Point{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
