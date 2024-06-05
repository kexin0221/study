package demo;

import java.util.Arrays;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle(2.5);
        MyCircle circle2 = new MyCircle(4.5);
        MyCircle circle3 = new MyCircle(2.5);
        MyCircle circle4 = new MyCircle(4.5);
        MyCircle circle5 = new MyCircle(2.5);
        MyCircle circle6 = new MyCircle(4.5);

        System.out.println("circle1 equals circle2 ? " + circle1.equals(circle2));
        System.out.println("circle1 equals circle3 ? " + circle1.equals(circle3));

        MyCircle[] circles = {circle1, circle2, circle3, circle4, circle5, circle6};
        Arrays.sort(circles);

        for (MyCircle circle : circles) {
            System.out.println(circle.getArea());
        }

    }
}