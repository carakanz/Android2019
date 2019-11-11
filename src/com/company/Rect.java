package com.company;

import org.jetbrains.annotations.NotNull;

public class Rect {
    abstract static class RectUtils {
        static long GetArea(@NotNull Point topLeft, @NotNull Point bottomRight) {
            return (topLeft.y - bottomRight.y) * (bottomRight.x - topLeft.y);
        }
        static int GetPerimeter(@NotNull Point topLeft, @NotNull Point bottomRight) {
            return 2 * (topLeft.y - bottomRight.y + bottomRight.x - topLeft.y);
        }
        static Point GetCenter(@NotNull Point topLeft, @NotNull Point bottomRight) {
            return new Point((topLeft.x + bottomRight.x) / 2,
                    (topLeft.y + bottomRight.y) / 2);
        }
        private RectUtils() {}
    }

    public Rect(@NotNull Point topLeft, @NotNull Point bottomRight) {
        if (topLeft.x > bottomRight.x ||
            topLeft.y < bottomRight.y) {
            throw new IllegalArgumentException();
        }

        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public long GetArea() {
        return RectUtils.GetArea(topLeft, bottomRight);
    }

    public int GetPerimeter() {
        return RectUtils.GetPerimeter(topLeft, bottomRight);
    }

    public Point GetCenter() {
        return RectUtils.GetCenter(topLeft, bottomRight);
    }

    private Point topLeft;
    private Point bottomRight;
}