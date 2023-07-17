package leetcodeQuestions;

// https://leetcode.com/problems/two-sum/

// Example
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] == diff){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return  res;
    }
}
