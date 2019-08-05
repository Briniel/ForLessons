package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ivama on 05.08.2019
 */


public class SquareTests {

    @Test
    public void testArea(){
        Point p1 = new Point(3,4);
        Point p2 = new Point(2,2);
        Assert.assertEquals(Point.distance(p1, p2), 2.23606797749979);
    }
}
