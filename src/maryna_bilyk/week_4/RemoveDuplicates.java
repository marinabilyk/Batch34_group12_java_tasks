package maryna_bilyk.week_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/

    public static void main(String[] args) {
        removeDuplicates("AAABBBCCC");
    }

    public static void removeDuplicates(String str) {

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        System.out.println(set);

    }

}
