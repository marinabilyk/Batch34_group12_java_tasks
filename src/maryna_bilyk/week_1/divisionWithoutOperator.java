package maryna_bilyk.week_1;

public class divisionWithoutOperator {

    public static void main(String[] args) {
        //Write a method that can divide two numbers without using division operator

        System.out.println(divide(45, 11));

    }
    public static int divide (int dividend, int divisor){
        int count = 0;            // count of how many times we can subtract divisor from dividend
        int remain = dividend;  // remain - variable to assign remaining value after each subtraction, assigned to dividend value as a max start point
        do {
            remain -= divisor;   // subtract divisor from the remaining value (remain) after each iteration
            count++;            // count each successful subtraction
        }while (remain >= divisor);  // perform action until remain value is the same or mote than divisor
        return count;
    }

}

