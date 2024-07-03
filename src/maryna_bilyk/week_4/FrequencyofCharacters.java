package maryna_bilyk.week_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

    public static void main(String[] args) {
        frequencyOfCharacters("hbuhrugrnguinrtigtohith");
    }

    public static void frequencyOfCharacters(String str) {

        Map<Character, Integer> counter = new HashMap<>();
// key is an each char, value is the frequence

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

// we're doing this if statement to initialise values in a map because Character and Integer are objects and have null value by default
            // if we just read value from the next step (counter.get(eachChar) + 1) and add 1 it would be null + 1 which will get NullPointException
            if (!(counter.containsKey(eachChar))){
                counter.put(eachChar,0);
            }

            // put(eachChar) - will ad a key if it is not existing and if it
            // is existing it will replace it with the same value because the key should be unique
            counter.put(eachChar, counter.get(eachChar) + 1);
        }
        System.out.println(counter);


    }


}
