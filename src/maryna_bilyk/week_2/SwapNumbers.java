package maryna_bilyk.week_2;

public class SwapNumbers {

    public static void main(String[] args) {
        swapNumbers(5,10);

    }

    public static void swapNumbers(int num1, int num2){

        int first = num1;  // 5
        int second = num2;  // 10
        System.out.println("Initial first value: " + first);
        System.out.println("Initial second value: " + second);

        first = num1 + num2;   // 5 + 10 = 15
        second = first - second; // 15 - 10 = 5
        first = first - second; // 15 - 5 = 10

        System.out.println("Result of first: " + first);
        System.out.println("Result of second: " + second);
    }
}
/*
Swap two variable's values without using a third variable
 */
