package com.algorithm.topic;

import java.util.HashSet;
import java.util.Set;

/**
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 * 请找出数组中任意一个重复的数字。
 *
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 */
public class FindRepeatNumber {
    // 哈希表
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i :
                nums) {
            if (set.contains(i)) {
                return i;
            }
            set.add(i);
        }
        return -1;
    }

    // 原地交换
    public int findRepeatNumber2(int[] nums) {
       int i = 0;
       while (i < nums.length){
           if(nums[i] == i){
               i ++;
               continue;
           }
           if(nums[nums[i]] == nums[i]) return nums[i];
           int temp =  nums[i];
           nums[i] = nums[temp];
           nums[temp] = temp;
       }
       return -1;
    }

    public static void main(String[] args) {
        new FindRepeatNumber().findRepeatNumber2(new int[]{2,4,5,5,1,5});
    }

}
