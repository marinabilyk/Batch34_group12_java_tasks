package Sevara.week1;

public class OddOrEven {
    public static void main(String[] args) {

        //Write  a method which can identifies given number is even or odd
        OddOrEven(5);


    }
    public static void OddOrEven(int number){
        if (number%2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
