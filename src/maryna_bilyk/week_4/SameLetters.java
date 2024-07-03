package maryna_bilyk.week_4;

public class SameLetters {
    /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/

    public static void main(String[] args) {
        System.out.println(sameLetters("asdt", "tsad"));
    }

    public static boolean sameLetters(String one, String two){

      boolean result = true;

      //corner case: if length is not the same return false
      if (one.length() != two.length()){
          return false;
      }

        for (int i = 0; i < one.length(); i++) {
            for (int j = 0; j < two.length(); j++) {

                // if two contains letter from one - go to the next iteration (check other letters)
                if (two.contains(String.valueOf(one.charAt(i)))){
                    continue;

                    // in other way return false because letter differs
                } else {
                    result = false;
                }
            }
        }
        return result;
    }

}
