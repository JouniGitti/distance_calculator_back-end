package geoservices.distanceCalculation;

import geoservices.distanceCalculation.Model.Line;

public class DistanceCalc {

    public static double distanceIs (Line line) {

        int R = 6371; //Radius of the earth
        Double theta1 = degreesToRadians(line.getFrom().getLat());
        Double theta2 = degreesToRadians(line.getTo().getLat());
        Double deltaTheta = degreesToRadians(line.getTo().getLat() - line.getFrom().getLat());
        double deltaLambda = degreesToRadians(line.getTo().getLon() - line.getFrom().getLon());

        double a = Math.pow(Math.sin(deltaTheta/2),2)
                + (Math.cos(theta1) * Math.cos(theta2))
                * Math.pow(Math.sin(deltaLambda/2),2);

        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        Double distance = R * c;

        return distance;
    }

    private static Double degreesToRadians(Double degrees) {
        double radians = degrees * Math.PI / 180;
        return radians;
    }

}