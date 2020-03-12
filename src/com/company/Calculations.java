package com.company;

public class Calculations {

    public static Point2D positionGeometricCenter(Point2D[] point) {

         double x = 0.0;
         double y = 0.0;

        for (Point2D i : point) {
            x += i.getPointX();
            y += i.getPointY();
        }
        return new Point2D(x / point.length, y / point.length);
    }

    public static Point2D positionCenterOfMass(MaterialPoint2D[] materialPoints) {

        double x = 0.0;
        double y = 0.0;
        double mass = 0.0;

        for(MaterialPoint2D i : materialPoints) {
            x += i.getPointX() * i.getMass();
            y += i.getPointY() * i.getMass();
            mass += i.getMass();
        }
        return new MaterialPoint2D(x / mass, y / mass, mass);
    }
}
