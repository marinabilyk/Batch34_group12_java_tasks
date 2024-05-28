package Abror.Week1;

public class Task1Division {
    public static void main(String[] args) {
        //Write a method that can divide two numbers without using division operator
        int a = 20,
        b= 5;
        int d=0;

        while ( a-b >= 0){

            a = a - b;
            ++d;
        }

        System.out.println(d);

    }
}
