package maryna_bilyk.week_3;

public class reverseNegativeNumber {
    public static void main(String[] args) {
        System.out.println(reverseNum(-159));

    }
    //Write a return method that can reverse negative number and return it as int

    public static int reverseNum(int num) {
        String reversed = "";
        int positive = 0;
        if (num < 1) {
            positive = num * (-1);
        }
        while (positive != 0) {
            reversed += "" + positive % 10;
            positive = positive / 10;
        }

        return Integer.parseInt(reversed);

    }

}

