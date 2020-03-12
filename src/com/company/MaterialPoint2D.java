package com.company;

public class MaterialPoint2D extends Point2D {

    double mass;

    public MaterialPoint2D(double pointX, double pointY, double mass) {
        super(pointX, pointY);
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "MaterialPoint2D{" +
                "mass=" + mass +
                ", pointX=" + pointX +
                ", pointY=" + pointY +
                '}';
    }

    public double getMass() {
        return mass;
    }
}
