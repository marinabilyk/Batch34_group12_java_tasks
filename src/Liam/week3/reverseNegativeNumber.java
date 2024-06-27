package Liam.week3;

public class reverseNegativeNumber {
    //Write a return method that can reverse negative number and return it as int

    public static void main(String[] args) {

        System.out.println(reverseNum(-98));

        System.out.println(StrReverse(-5));
    }

    public static int reverseNum(int  num) {

        String str = new StringBuilder(""+num).reverse().toString();// 35-

        if(num < 0) {
            str = "-"+str.substring(0, str.length()-1);
        }

        return Integer.valueOf(str);
    }

    public static String StrReverse(int num) {

        String reverse="";
        String s = String.valueOf(num);

        for(int i=s.length()-1; i >= 0; i--) {
            reverse += s.toCharArray()[i];
        }

        String s1 = "-" + reverse.substring(0, reverse.length() - 1);
        return s1;

    }
}

