package Rufiya.week_4;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        frequencyOfCharacter("AAABBCDD");
    }

    public static void frequencyOfCharacter(String str){

        Map<Character, Integer> result = new LinkedHashMap<>();
        // key = each char; value = frequency

        for(int i = 0; i < str.length(); i++){
            char eachChar = str.charAt(i);

            if(!result.containsKey(eachChar)){
                result.put(eachChar, 0);
            }

            result.put(eachChar, result.get(eachChar) + 1);

        }

        System.out.println(result);

    }
}
  /*
  Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    */

