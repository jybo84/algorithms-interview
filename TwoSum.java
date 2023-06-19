/* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
 target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/

import java.util.Arrays;

public class TwoSum {
    public static  int[] sum(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                    if (num[i] + num[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
        System.out.print("нет таких значений ");
        return null;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 20;
        System.out.println(Arrays.toString(sum(nums, target)));
    }
}
