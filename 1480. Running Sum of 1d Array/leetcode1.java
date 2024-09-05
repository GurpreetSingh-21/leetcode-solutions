import java.util.Arrays;

public class leetcode1 {

    public int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        leetcode1 obj = new leetcode1();
        int nums[] = {1, 2, 3, 4};
        int[] result = obj.runningSum(nums);
        System.out.println("The Output is -> " + Arrays.toString(result));
    }
}
