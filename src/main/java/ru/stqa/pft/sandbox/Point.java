package ru.stqa.pft.sandbox;

/**
 * Created by ivama on 05.08.2019
 */


public class Point {

    protected double x;
    protected double y;

    Point(double xCoord, double yCoord){
        this.x = xCoord;
        this.y = yCoord;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public static double distance(Point a, Point b)
    {
        double dx = a.x - b.x;
        double dy = a.y - b.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
