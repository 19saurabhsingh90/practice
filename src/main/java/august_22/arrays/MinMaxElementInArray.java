package august_22.arrays;

import java.util.ArrayList;

public class MinMaxElementInArray {
    public static void main(String[] args) {
        for (Long minMax : getMinMax(new long[]{3, 2, 1, 56, 10000, 167}, 6)) {
            System.out.println(minMax);
        }
    }
    static ArrayList<Long> getMinMax(long[] arr, long n)
    {

        //Write your code here
        // I am doing this changes
        ArrayList<Long> minMaxList = new ArrayList<>();
        long minValue = arr[0];
        long maxValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
        if(arr[i]<minValue){
            minValue=arr[i];
        }
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
        }

        minMaxList.add(minValue);
        minMaxList.add(maxValue);
        return minMaxList;
    }
}
