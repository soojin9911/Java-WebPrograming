package ch01_5;

public class PoolPuzzleOne {
    public static void main(String[] args) {
        System.out.println("Hello World!, 차수진_2018250051");
        int x=0;

        while(x<4) {
            System.out.print("a");
            if(x<1) {
                System.out.print(" ");
            }
            System.out.print("n");

            if(x>1) {
                System.out.print(" oyster");
                x=x+2;
            }
            if(x==1) {
                System.out.print("noys");
            }
            if(x<1) {
                System.out.print("oise");
            }
            System.out.println("");
            x=x+1;
        }
    }
}
