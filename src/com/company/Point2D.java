package com.company;

public class Point2D {

    double pointX;
    double pointY;

    public Point2D(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public double getPointY() {
        return pointY;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "pointX=" + pointX +
                ", pointY=" + pointY +
                '}';
    }
}
