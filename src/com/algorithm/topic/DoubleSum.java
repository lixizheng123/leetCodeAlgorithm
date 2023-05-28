package com.algorithm.topic;

/**
 * 链表两数相加
 * 两个非空链表，表示两个非负整数，采用逆序方式存储，每个节点只能存储一位数
 */
public class DoubleSum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode head = null, tail = null;
        // 存储进位
        int maxSum = 0;
        while (l1 != null || l2 != null){
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;

            // 当前两数的和 + 前一位的进位
            int sum = n1 + n2 + maxSum;

            if(head == null){
                // 初始化头、尾指针
                head = tail = new ListNode(sum % 10);
            }else{
                // 头指针位不为空时，那么尾指针进行存储当前进位
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }

            maxSum = sum / 10;

            // 两个链表向前移动
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        if(maxSum > 0){
            tail.next = new ListNode(maxSum);
        }

        return head;
    }
}

class ListNode{
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}