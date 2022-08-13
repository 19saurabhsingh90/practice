package august_22.arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        // input nums = [1,1,0,1,1,1,0];
        /*
         * Case 1 : Input array length = 0 return 0;
         * Case 2 : Input array length  = 1 and the number is 1 return 1
         * Case 3 : Input array length  = 1 and the number is 0 return 0
         * */
        System.out.println("Max consecutive ones => " + maxConsecutiveOnes(new int[]{0, 0, 0, 1, 0, 1, 0}));
    }

    public static int maxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int counter = 0;
        if (nums.length > 0) {
            for (int number :
                    nums) {
                if (number == 1) {
                    counter = counter + 1;
                } else {
                    counter = 0;
                }
                maxOnes = Math.max(counter, maxOnes);
            }
        }

        return maxOnes;
    }
}
