package Sevara.week3;

public class reverseNegativeNumber {
    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-5));
    }
    //Write a return method that can reverse negative number and return it as int

    public static int reverseNegativeNumber(int number){
        return Math.abs(number);
    }


}

