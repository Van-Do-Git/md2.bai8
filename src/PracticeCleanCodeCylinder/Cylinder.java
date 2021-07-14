package PracticeCleanCodeCylinder;

public class Cylinder {
    public static double getVolume(int radius, int height) {
        double volume = getPerimeter(radius) * height + 2 * getBaseArea(radius);
        return volume;
    }

    public static double getPerimeter(int radius) {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public static double getBaseArea(int radius) {
        double baseArea = Math.PI * radius * radius;
        return baseArea;
    }
}
