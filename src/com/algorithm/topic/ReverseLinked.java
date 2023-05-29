package com.algorithm.topic;

/**
 * 剑指 Offer 24. 反转链表
 *
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 */
public class ReverseLinked {

    /**
     * 迭代（双指针 尾插法）
     * @param head 头指针
     * @return 反转后的链表
     */
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

    /**
     * 递归实现 反转链表
     * @param cur 当前节点
     * @param pre 辅助指针
     * @return 交换
     */
    public ListNode recur(ListNode cur, ListNode pre){
        if(cur == null) return pre;
        ListNode res = recur(cur.next, cur);
        cur.next = pre;
        return res;
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

        // 双指针 尾插法
//        ListNode listNode = reverseLinked.reverseList(listNode1);
        ListNode listNode = reverseLinked.recur(listNode1, null);

        // 遍历链表
        while (listNode != null){
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }

    }
}
