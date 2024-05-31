package Rufiya.week_1;

public class DivisionWithoutOperator {

    public static void main(String[] args) {

        divide(17, 5);
        divide(25, 5);
    }
    public static void divide (int n1, int n2){

        int count = 0;
        String result = n1 + "/" + n2 + " is ";

        while (n1 >= n2){
            count ++;
            n1 -= n2;
        }
        System.out.println(result + count + " with remainder " + n1);
    }
}
/*
Write a method that can divide two numbers without using division operator
 */