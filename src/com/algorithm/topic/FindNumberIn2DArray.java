package com.algorithm.topic;

/**
 * 二维数组中的查找
 * 
 *
 *在一个 n * m 的二维数组中，每一行都按照从左到右 非递减 的顺序排序，
 *  * 每一列都按照从上到下 非递减 的顺序排序。请完成一个高效的函数，
 *  * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 *
 *  给定 target = 5，返回 true。
 *  给定 target = 20，返回 false。
 */
public class FindNumberIn2DArray {
    // 穷举遍历
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt == target) return true;
            }
        }
        return false;
    }

    // 有序数组查找 首先想到二分
    public boolean findNumberIn2DArray2(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            int start = 0, end = ints.length - 1;
            while (start <= end) {
                int min = (start + end) / 2;

                if (target == ints[min]) {
                    return true;
                }

                if (target > ints[min]) start = min + 1;
                else end = min - 1;
            }
        }
        return false;
    }
    // 找左下角 或者右上角   建议找左下角
    public boolean binarySearchTree(int[][] matrix,int target){
        int x = matrix.length - 1, y = 0;

        while (x >= 0 && y < matrix[0].length){
            if(matrix[x][y] > target) x --;
            else if(matrix[x][y] < target) y ++;
            else return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] ints = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int[][] ints2 = {
                {}
        };
        FindNumberIn2DArray findNumberIn2DArray = new FindNumberIn2DArray();
//        System.out.println(findNumberIn2DArray.findNumberIn2DArray2(ints, 11));
        System.out.println(findNumberIn2DArray.binarySearchTree(ints2, 11));
    }
}
