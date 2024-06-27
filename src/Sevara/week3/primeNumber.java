package Sevara.week3;

public class primeNumber {
    public static void main(String[] args) {
        System.out.println("primeNumber = " + primeNumber(8));
    }
     /*
        Write a method that can check if a number is prime or not
     */
    public static boolean primeNumber(int number){
        boolean isPrime= false;
        if(number>1 && number%number == 0 && number%2 !=0){
            isPrime = true;
        } else if (number==2) {
            isPrime = true;
        }

        return isPrime;
    }



}
