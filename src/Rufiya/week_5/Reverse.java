package Rufiya.week_5;

public class Reverse {

    public static void main(String[] args) {

        System.out.println(reversed("ABCD"));
    }
    public static String reversed (String str){
       String result = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
/* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/