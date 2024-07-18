package Rufiya.week_4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        removeDuplicates("AAABBBCCC");
    }

    public static void removeDuplicates (String str){
        Set<Character> result = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            result.add(str.charAt(i));
        }
        System.out.println(result);
    }
}
 /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/