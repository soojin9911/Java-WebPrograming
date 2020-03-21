package ch01_6;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println("Hello World!, 차수진_2018250051");
        Scanner sc = new Scanner(System.in);

        System.out.print("Plese enter number to calculate:");
        int num = sc.nextInt();
        double result = Math.sqrt(num);
        System.out.println("The square root of " + num + " is "+ result);

        System.out.println(" ");
        System.out.println("by 2018250051 차수진");
    }
}
