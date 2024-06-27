package maryna_bilyk.week_3;

public class armstrongNumbers {
    public static void main(String[] args) {
        System.out.println("armstrong() = " + armstrong(371));


    }

    public static boolean armstrong(int num) {

        String numbers = "";
        int count = 0;
        int sum = 0;
        int tempNum = num;


        while (tempNum != 0) {
            numbers += tempNum % 10 + ",";
            tempNum = tempNum / 10;
        }
        String[] split = numbers.split(",");
        int length = split.length;


        for (int i = 0; i < length; i++) {
            int extractedNum = Integer.parseInt(split[i]);
            sum += Math.pow(extractedNum, length);

        }
        if (sum == num) {
            return true;

        }
        return false;
    }

}

    /*
    Write a method that can check if a number is Armstrong number
     */



