package Rufiya.week_5;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class FindUnique {
    public static void main(String[] args) {
        System.out.println(getUniqueCharacters("AAABBBCCCDEF"));
    }
    public static String getUniqueCharacters (String str){

        Map<Character, Integer> charMap = new HashMap<>();

        for (char eachCharacter : str.toCharArray()){
            charMap.put(eachCharacter, charMap.getOrDefault(eachCharacter, 0) + 1);
        }
        StringBuilder result = new StringBuilder();
        for (char each : str.toCharArray()){
           if (charMap.get(each) == 1){
               result.append(each);
           }
        }
        return result.toString();
    }

}
  /*Write a return  method that can find the unique characters from the String
        Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/
