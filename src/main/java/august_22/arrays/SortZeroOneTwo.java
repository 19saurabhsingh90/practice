package august_22.arrays;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        sort012(new int[]{1,1,1,1}, 4);
    }

    public static void sort012(int[] a, int n) {
        // code here

        int zeroElementsCount = 0;
        int oneElementsCount = 0;
        int twoElementsCount = 0;

        for (int num : a) {
            if (num == 0) {
                zeroElementsCount += 1;
            }
            if (num == 1) {
                oneElementsCount += 1;
            }
            if (num == 2) {
                twoElementsCount += 1;
            }
        }


        int index = 0;
        int oneIndex = zeroElementsCount+oneElementsCount;
        int twoIndex = oneIndex+twoElementsCount;


        while (index < zeroElementsCount) {
            a[index] = 0;
            index++;
        }
        while(index < oneIndex){
            a[index] = 1;
            index++;
        }
        while(index < twoIndex){
            a[index] = 2;
            index ++;
        }
        for (int i :
                a) {
            System.out.println(i);
        }
    }
}
