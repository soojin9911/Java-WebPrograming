package ch01_1;

public class Loopy {
    public static void main(String[] args) {
        System.out.println("Hello World!, 차수진_2018250051");
        int x = 1;
        System.out.println("Before the Loop");
        while (x < 4) {
            System.out.println("In the loop");
            System.out.println("Value of x is " + x);
            x = x + 1;
        }
        System.out.println("This is after the loop");

    }
}

