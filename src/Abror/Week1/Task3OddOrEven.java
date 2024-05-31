package Abror.Week1;

public class Task3OddOrEven {
    public static void main(String[] args) {

        //Write  a method which can identifies given number is even or odd
    oddOrEven(56);
    }
    public static void oddOrEven(int number){
        if (number % 2 == 0){
            System.out.println(number + " is Even number");
        }
        else {
            System.out.println(number + " is Odd number");
        }
    }
}