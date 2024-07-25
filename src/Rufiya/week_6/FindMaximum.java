package Rufiya.week_6;

public class FindMaximum {
    public static void main(String[] args) {
        int [] array = {3, 5, 1, 10, -1, 5};
        System.out.println(maxNum(array));
    }
    public static int maxNum(int[] array){
        int max = array[0];

        for(int each : array){
            if(each > max){
                max = each;
            }
        }
        return max;
    }
}
//Write a method that can find the maximum number from an int Array