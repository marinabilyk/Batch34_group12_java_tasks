package Danny.week_1;

public class Task3oddOrEven {

    ////Write  a method which can identifies given number is even or odd

    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(2);

    }

    public static void oddOrEven (int givenNum){
        if(givenNum % 2 == 0){
             System.out.println("the number " + givenNum + " is EVEN");
        }else{
            System.out.println("the number " + givenNum + " is ODD");
        }
    }
}

