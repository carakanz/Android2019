package com.company;

public class Main {
    public static void main(String[] args) {
        Point firstPoint = new Point();
        firstPoint.x = -1;
        firstPoint.y = -2;
        Point secondPoint = new Point();
        secondPoint.x = 2;
        secondPoint.y = 2;
        System.out.println(distance(firstPoint, secondPoint));
    }

    private static double distance(Point firstPoint, Point secondPoint) {
        int deltaX = (firstPoint.x - secondPoint.x);
        int deltaY = (firstPoint.y - secondPoint.y);
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

}
