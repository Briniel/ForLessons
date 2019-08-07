package ru.stqa.pft.sandbox;

/**
 * Created by ivama on 05.08.2019
 */


public class Point {

    protected double x;

    Point(double xCoord){
        this.x = xCoord;
    }

    public double getX(){
        return x;
    }

    public double distance(Point a)
    {
        return Math.sqrt(a.getX() * a.getX() + this.x *  this.x);
    }
}
