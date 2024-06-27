package Sevara.week3;

import java.util.Map;

public class armstrongNumbers {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(123));
    }
    /*
    Write a method that can check if a number is Armstrong number
     */
    public static boolean isArmstrongNumber(int number){
        boolean isArmstrong = false;
        String n = String.valueOf(number);
        int index = n.length();

        int armstrong = 0;
        for (int i = 0; i < n.length(); i++) {
            int digit = Character.getNumericValue(n.charAt(i));
            armstrong += Math.pow(digit,index);
            if (armstrong == number){
                isArmstrong = true;
            }
        }
        return isArmstrong;
    }


}
