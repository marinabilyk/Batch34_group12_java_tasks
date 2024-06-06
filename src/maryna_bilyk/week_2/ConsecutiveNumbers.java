package maryna_bilyk.week_2;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        printConsecutiveNum(24);
    }
    public static void printConsecutiveNum(int num) {

        for (int i = 1; i <= num; i++) {

            List<String> consecutiveNum = new ArrayList<>();

            if ((i % 2 == 0 || i % 3 == 0 || i % 5 == 0)) {
                if (i % 2 == 0) {
                    consecutiveNum.add("Codility");
                }
                if (i % 3 == 0) {
                    consecutiveNum.add("Test");
                }
                if (i % 5 == 0) {
                    consecutiveNum.add("Coders");
                }
            }else if ((i % 2 == 1 || i % 3 == 1 || i % 5 == 1)) {
                consecutiveNum.add(i + "");
            }
            System.out.println(consecutiveNum);
        }
    }
}

/*
Numbers -- print consecutive numbers
Write a function:
that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
For example, here is the output for N = 24:
Codility
Test
Codility
Coders
CodilityTest
7
Codility
Test
CodilityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
17
 */