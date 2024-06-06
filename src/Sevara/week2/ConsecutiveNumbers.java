package Sevara.week2;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        System.out.println(consecutiveNumbers(24));
    }
    public static String consecutiveNumbers(int n){
        String result = "";
        for (int i = 2; i <= n; i++) {
            if(i % 2 ==0 && i % 3== 0 && i % 5 ==0){
                result += " CodilityTestCoders ";
            } else if (i % 2 ==0 && i % 3== 0) {
                result += " CodilityTest \n";
            } else if (i % 3== 0 && i % 5 ==0) {
                result += " TestCoders \n";
            } else if (i % 2 ==0) {
                result += " Codility \n";
            } else if (i % 3 ==0) {
                result += " Test \n";
            } else if (i % 5 ==0) {
                result += " Coders \n";
            }else {
                result += i + " \n";
            }
        }
        return result;
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