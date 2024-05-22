package demo;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("row:");
        int row = input.nextInt();
        System.out.println("column:");
        int column = input.nextInt();
        System.out.println("the array:");
        double[][] arr = new double[row][column];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<column;j++){
                arr[i][j] = input.nextDouble();
            }
        }

        Location location = Location.locateLargest(arr);
        System.out.println("The location of the largest element is "+
                location.maxValue+" at ("+location.row+
                ","+location.column+")");
    }
}
