package com.company;

public class Main {
    public static void main(String[] args) {
        Point firstPoint = new Point(-1, -2);
        Point secondPoint = new Point(2, 2);
        System.out.println(distance(firstPoint, secondPoint));
    }

    static double distance(Point firstPoint, Point secondPoint) {
        int deltaX = (firstPoint.x - secondPoint.x);
        int deltaY = (firstPoint.y - secondPoint.y);
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

}
