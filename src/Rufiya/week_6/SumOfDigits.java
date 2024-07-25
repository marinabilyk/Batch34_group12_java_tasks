package Rufiya.week_6;

public class SumOfDigits {

    public static void main(String[] args) {

        String input = "11111";
        System.out.println("The sum of digits is: " + sumOfDigits(input));

    }

    public static int sumOfDigits(String input) {
        int sum = 0;
        for (char character : input.toCharArray()) {
            if (Character.isDigit(character)) {
                sum += Character.getNumericValue(character);
            }
        }
        return sum;
    }


}
//Write a method that can return the sum of the digits in a string