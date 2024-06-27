package maryna_bilyk.week_3;

public class primeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }
     /*
        Write a method that can check if a number is prime or not
     */

public static boolean isPrime(int num) {

    if (num <= 1){
        return false;
    }

    for (int i = 2; i < num; i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}
}
