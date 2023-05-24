package com.algorithm.topic;

/**
 * 斐波那契数列
 */
public class Fbi {
    public int fbi(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fbi(n - 1) + fbi(n - 2);
    }

    /**
     * dp解法
     * @param n
     * @return
     */
    public int fbiArray(int n){
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n - 1];
    }

    /**
     * 空间 O(n)
     * 时间 O(n)
     * dp 优化
     * @param n
     * @return
     */
    public int fbiArray02(int n){
        // 第一位置
        int a = 1;
        // 第二位置
        int b = 1;
        // 第三位置
        int c = 0;

        for (int i = 2; i < n; i++) {
            // 计算第三的位置
            c = a + b;
            // 第一个位置换成 第二的位置
            a = b;
            // 第二的位置换成 第三的位置
            b = c;
        }

        return c;
    }
}
