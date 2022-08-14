package august_22.arrays;

import java.util.ArrayList;

public class SubArrayWithSum {
    public static void main(String[] args) {
        subarraySum(new int[]{1, 2, 3, 7, 5}, 5, 12);
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Your code here
        ArrayList<Integer> position = new ArrayList<>();
        int i = 0, j = 0;
        int sum = 0;
        while (j < n) {
            if (sum < s && i < n) {
                sum = sum + arr[i];
                if (sum == s) {
                    position.add(j + 1);
                    position.add(i + 1);
                    break;
                }
                i += 1;
            } else {
                sum = 0;
                j += 1;
                i = j;
            }

            if (j >= n) position.add(-1);
        }
        return position;
    }
}
