package Sevara.week2;

public class SwapNumbers {
    public static void main(String[] args) {
        System.out.println(SwapNumbers(2,5));
    }

    public static String SwapNumbers(int n1, int n2){
        n1 = n1 - n2;
        n2 = n1 + n2;
        n1 = n2 - n1;
        return "n1 = " + n1 + ", n2 = "+n2;
    }
}
/*
Swap two variable's values without using a third variable
 m = m - n;
        n = m + n;
        m = n - m;
 */