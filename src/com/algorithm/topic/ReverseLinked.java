package com.algorithm.topic;

/**
 * 剑指 Offer 24. 反转链表
 *
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 */
public class ReverseLinked {

    public ListNode reverseList(ListNode head){
        // 尾插法生成新的链表
        ListNode p = null;
        ListNode h;
        while (head != null){
            h = head;
            head = head.next;
            h.next = p;
            p = h;
        }
        return p;
    }

    public static void main(String[] args) {
        ReverseLinked reverseLinked = new ReverseLinked();

        ListNode listNode1 = new ListNode(10);
        ListNode listNode2 = new ListNode(17);
        ListNode listNode3 = new ListNode(12);
        ListNode listNode4 = new ListNode(13);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        ListNode listNode = reverseLinked.reverseList(listNode1);

        while (listNode != null){
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }

    }
}
