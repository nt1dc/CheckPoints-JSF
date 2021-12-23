package Util;

public class Utils {

    public static boolean atArea(double x, double y, double r) {
        return atQuarterCircle(x, y, r) || atRectangle(x, y, r) || atTriangle(x, y, r);
    }

    private static boolean atQuarterCircle(double x, double y, double r) {
        return ((x >= 0) && (y <= 0) && ((x * x + y * y) <= r * r / 4));
    }

    private static boolean atTriangle(double x, double y, double r) {
        return ((x <= 0) && (y >= 0) && (y <= r + 2 * x));
    }

    private static boolean atRectangle(double x, double y, double r) {
        return ((x >= 0) && (y >= 0) && (y <= r) && (x <= r / 2));
    }

    public static double getDoubleParameter(String parameter) {
        return Double.parseDouble((parameter).replace(",", "."));
    }
}


