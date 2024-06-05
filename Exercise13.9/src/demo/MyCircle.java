package demo;

public class MyCircle extends GeometricObject implements Comparable<MyCircle> {
    private double radius;

    public MyCircle() {
    }

    public MyCircle(double radius) {
        this(radius, "white", false);
    }

    public MyCircle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public int compareTo(MyCircle circle) {
        if (getArea() < circle.getArea()) {
            return -1;
        } else
            return 1;
    }

    @Override
    public boolean equals(Object o) {
        return ((MyCircle) o).getRadius() == radius;
    }
}