import java.util.HashMap;
import java.util.Map;

public class leetcode1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> num_map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (num_map.containsKey(complement)) {
                return new int[] { num_map.get(complement), i };
            }
            num_map.put(nums[i], i);
        }
        return new int[] {}; 
    }

   
    public static void main(String[] args) {
      
        leetcode1 solution = new leetcode1();

       
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        
        int[] result = solution.twoSum(nums, target);

        
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
