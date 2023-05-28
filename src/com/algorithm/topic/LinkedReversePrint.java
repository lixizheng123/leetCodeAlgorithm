package com.algorithm.topic;

/**
 * 剑指 Offer 06. 从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 * 示例1：
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 */
public class LinkedReversePrint {
    public int[] reversePrint(List_node head){
        // 统计总数
        List_node cur = head;
        int count = 0;
        while(cur != null){
            cur = cur.next;
            count ++;
        }

        int[] arr = new int[count];
        cur = head;
        count --;
        while (cur != null && count >= 0){
            arr[count --] = cur.val;
            cur = cur.next;
        }

        return arr;
    }
}
class List_node{
    int val;
    List_node next;
    List_node(int x) { val = x;}
}