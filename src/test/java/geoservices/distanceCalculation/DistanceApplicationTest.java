package geoservices.distanceCalculation;

import geoservices.distanceCalculation.Model.Coordinate;
import geoservices.distanceCalculation.Model.Line;
import org.junit.Test;
import static org.junit.Assert.*;

public class DistanceApplicationTest{
    @Test
    public void testReturningDistanceWithpoints(){
        Coordinate toPoint = new Coordinate();
        toPoint.setLat(60.197393);
        toPoint.setLon(24.881129);
        Coordinate fromPoint = new Coordinate();
        fromPoint.setLat(60.808435);
        fromPoint.setLon(21.411667);
        Line line = new Line();
        line.setTo(toPoint);
        line.setFrom(fromPoint);
        assertEquals(DistanceCalc.distanceIs(line),201.710, 0.001);

    }

}
