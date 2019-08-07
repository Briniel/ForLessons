package ru.stqa.pft.sandbox;

/**
 * Created by ivama on 05.08.2019
 */


public class FirstProg {

    public static void main(String[] args) {
       Point p1 = new Point(3);
        Point p2 = new Point(2);
        System.out.println("Distance between two points = "+ p1.distance(p2));
    }
}
