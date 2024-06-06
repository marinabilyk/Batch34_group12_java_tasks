package Rufiya.week_2;

public class SwapNumbers {
    public static void main(String[] args) {

        // Option #1

        int a = 5;
        int b = 10;
        int c = 0;

        c = a; // 5
        a = b; // 10
        b = c; // 5

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //Option#2

        int d = 5;
        int f = 10;

        d = d + f; // 15
        f = d - f; // 5
        d = d - f; // 10

        System.out.println("d = " + d);
        System.out.println("f = " + f);

    }
}
/*
Swap two variable's values without using a third variable
 */