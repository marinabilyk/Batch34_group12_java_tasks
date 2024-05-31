package Abror.Week1;

public class Task1Division {
    public static void main(String[] args) {
        //Write a method that can divide two numbers without using division operator
 division(15,0);
    }
    public static void division(int num1, int num2){

    if (num2 == 0){
    System.out.println("Invalid number");
    return;
}
        int count=0;
        System.out.print(num1 +" divided by "+num2 +" is: ");
        while ( num1-num2 >= 0){

            num1 = num1 - num2;
            ++count;
        }


        System.out.println(count+" and remainder is "+num1);

    }
}
