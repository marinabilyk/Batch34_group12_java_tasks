package Rufiya.week_4;

public class SameLetters {
    public static void main(String[] args) {
        System.out.println(sameLetters("abc", "cab"));
    }
    public static boolean sameLetters(String str1, String str2){

        boolean result = true;

        if (str1.length() != str2.length()){
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {

                if (str2.contains(String.valueOf(str1.charAt(i)))){
                    continue;
                } else {
                    result = false;
                }
            }
        }
        return result;
    }

}
   /*
   Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:
    */