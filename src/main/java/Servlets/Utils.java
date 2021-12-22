package Servlets;

import java.util.Arrays;
import java.util.List;

public class Utils {

    private static final List<Double> rValues = Arrays.asList(2.25,2.5,2.75,3.0,3.25,3.25,3.5,3.75,4.0,4.25,4.5,4.75,5.0);

    public static boolean checkDataValidation(double x, double y, double r) {
        if (rValues.contains(r) && (-4 <= x && x <= 4) && (-5 <= y && y <= 5)) {
            return true;
        }
        return false;
    }


    public static boolean atArea(double x, double y, double r) {
        return atQuarterCircle(x, y, r) || atRectangle(x, y, r) || atTriangle(x, y, r);
    }

    private static boolean atQuarterCircle(double x, double y, double r) {
        return ((x >= 0) && (y <= 0) && ((x * x + y * y) <= r * r / 4));
    }

    private static boolean atTriangle(double x, double y, double r) {
        return ((x <= 0) && (y >= 0) && (y<=r+2*x));
    }

    private static boolean atRectangle(double x, double y, double r) {
        return ((x >= 0) && (y >= 0) && (y <= r) && (x <= r / 2));
    }
    public static double getDoubleParameter(String parameter) {
        return Double.parseDouble((parameter).replace(",", "."));
    }
}


