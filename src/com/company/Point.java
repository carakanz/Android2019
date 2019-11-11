package com.company;

import java.util.Objects;

class Point {
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    int x;
    int y;

//    public boolean equals(Object o) {
//        return o != null &&
//                o.getClass() == getClass() &&
//                x == ((Point) o).x &&
//                y == ((Point) o).y;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
