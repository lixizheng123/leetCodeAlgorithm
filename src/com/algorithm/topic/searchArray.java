package com.algorithm.topic;

import java.util.Arrays;

/**
 * 在排序数组中查找数字 I
 * 统计一个数字在排序数组中出现的次数。
 *
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: 2
 */
public class searchArray {
    // 穷举 遍历数组
    // 时间复杂度： O(n)
    // 空间复杂度:  O(1)
    public int search(int[] nums, int target) {
        int count = 0;
        for (int num : nums) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    // 使用分治思想 二分法
    public int search2(int[] nums, int target){
        int i = 0;
        int j = nums.length - 1;

        // 搜索右边界
        while (i <= j){
            int m = (i + j) / 2;
            if(nums[m] <= target) i = m + 1;
            else j = m - 1;
        }

        int right = i;
        if (j >= 0 && nums[j] != target) return 0;
        i = 0;
        j = nums.length - 1;
        while (i <= j){
            int m = (i + j) / 2;
            if(nums[m] < target) i = m + 1;
            else j = m - 1;
        }
        int left = j;
        return right - left - 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,7,7,8,8,10};
        searchArray searchArray = new searchArray();
        System.out.println(searchArray.search2(arr, 8));
    }

}
