package maryna_bilyk.week_1;

public class oddOrEven {

    public static void main(String[] args) {

        //Write  a method which can identifies given number is even or odd

        defineEvenOdd(13);

    }
    public static void defineEvenOdd(int num){
        if (num % 2 == 0){
            System.out.println("number " + num + " is even");
        } else if (num % 2 == 1) {
            System.out.println("number " + num + " is odd");
        }
    }
}
