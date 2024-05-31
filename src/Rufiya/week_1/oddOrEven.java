package Rufiya.week_1;

public class oddOrEven {
    public static void main(String[] args) {
        identifyOddOrEven(10);
        identifyOddOrEven(7);
    }
    public static void identifyOddOrEven(int num) {

        if (num % 2 == 1) {
            System.out.println(num + " is odd");
        } else if (num % 2 == 0) {
            System.out.println(num + " is even");
        }
    }
}
/*
   //Write  a method which can identifies given number is even or odd

 */