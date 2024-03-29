package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ivama on 05.08.2019
 */


public class SquareTests {

    @Test
    public void testArea(){
        Point p1 = new Point(3, 4);
        Point p2 = new Point(2, 1);
        Assert.assertEquals(p1.distance(p2), 3.1622776601683795);
        Assert.assertEquals(p1.distance(p2), p2.distance(p1));
    }
}
