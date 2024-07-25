package Rufiya.week_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortLettersNumbers {

    public static void main(String[] args) {

        System.out.println(splitSortAppend("DC501GCCCA098911"));
    }

        public static String splitSortAppend(String input) {
            if (input == null || input.isEmpty()) {
                return input;
            }

            List<String> substrings = new ArrayList<>();
            StringBuilder currentSubstring = new StringBuilder();
            char lastChar = input.charAt(0);
            currentSubstring.append(lastChar);

            for (int i = 1; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if (Character.isLetter(currentChar) == Character.isLetter(lastChar) &&
                  Character.isDigit(currentChar) == Character.isDigit(lastChar)) {
                    currentSubstring.append(currentChar);
                } else {
                    substrings.add(currentSubstring.toString());
                    currentSubstring = new StringBuilder();
                    currentSubstring.append(currentChar);
                }
                lastChar = currentChar;
            }
            substrings.add(currentSubstring.toString());

            StringBuilder result = new StringBuilder();
            for (String substring : substrings) {
                char[] chars = substring.toCharArray();
                Arrays.sort(chars);
                result.append(new String(chars));
            }

            return result.toString();
        }

    }

/*Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
Ex:
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"*/