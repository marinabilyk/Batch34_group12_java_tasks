package Rufiya.week_3;

public class ArmstrongNumber {
    public static void main(String[] args) {

        System.out.println(isArmstrong(407));
        System.out.println(isArmstrong(408));
    }
    public static boolean isArmstrong (int n){
        int temp =n;
        int digits = 0;
        while (temp > 0){
            digits++;
            temp /= 10;
        }
        temp =n;
        int sum = 0;
        while (temp > 0){
            int eachDigit = temp % 10;
            sum += Math.pow(eachDigit, digits);
            temp /= 10;
        }
        return sum == n;
    }
}
/*
    Write a method that can check if a number is Armstrong number
     */