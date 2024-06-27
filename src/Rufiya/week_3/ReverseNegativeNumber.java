package Rufiya.week_3;

public class ReverseNegativeNumber {

    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-123456));
    }
    public static int reverseNegativeNumber (int num){
        int reversed = 0;
        num = Math.abs(num);

        while (num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num/= 10;
        }
        return -reversed;
    }
}
//Write a return method that can reverse negative number and return it as int
