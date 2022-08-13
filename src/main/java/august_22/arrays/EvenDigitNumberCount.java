package august_22.arrays;

public class EvenDigitNumberCount {
    public static void main(String[] args) {
        int[] nums = {112345,0,9,8,22};
        System.out.println("Total even digit numbers => " + eventDigitCount(nums));
    }

    public static int eventDigitCount(int[] nums) {

        int counter = 0;
        if (nums.length == 0) return counter;
        for (int num : nums) {
            if (getDigitCount(num) % 2 == 0 && num !=0) {
                counter++;
            }
        }
        return counter;
    }

    private static int getDigitCount(int num) {
        int digitCounter = 0;
        while (num % 10 != 0) {
            digitCounter++;
            num = num / 10;
        }
        return digitCounter;
    }
}
