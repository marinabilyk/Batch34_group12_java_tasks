package Sevara.week1;

public class DivisionWithoutOperator {
    public static void main(String[] args) {

        //Write a method that can divide two numbers without using division operator
        System.out.println(divisionWithoutOperator(15, 3));


    }
    public static int divisionWithoutOperator(int n1,int n2){
        int count = 0;

        while(n1 >= n2){
            n1 -= n2;
            count++;
        }
        return count;
    }
}
