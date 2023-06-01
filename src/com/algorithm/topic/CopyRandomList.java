package com.algorithm.topic;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 35. 复杂链表的复制
 *
 * 请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，
 * 每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
 *
 * 输入：head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
 * 输出：[[7,null],[13,0],[11,4],[10,2],[1,0]]
 */
public class CopyRandomList {
    public ListNode copyRandomList(ListNode head) {
        if(head == null){
            return null;
        }

        ListNode cur = head;
        Map<ListNode, ListNode> map = new HashMap<>();
        while (cur != null){
            map.put(cur, new ListNode(cur.val));
            cur = cur.next;
        }

        cur = head;
        while(cur != null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }

        return map.get(head);
    }

    public ListNode copyRandomList2(ListNode head){
        if (head == null) return null;
        ListNode cur = head;
        // 1. 复制各个节点 并构建拼接链表
        while(cur != null){
            ListNode temp = new ListNode(cur.val);
            temp.next = cur.next;
            cur.next = temp;
            cur = temp.next;
        }
        // 2. 构建各新节点的random指向
        cur = head;
        while (cur != null){
            if(cur.random != null){
                cur.next.random = cur.random.next;
            }
            cur = cur.next;
        }
        // 3. 拆分两链表
        cur = head.next;
        ListNode pre = head, res = head.next;
        while(cur.next != null){
            pre.next = pre.next.next;
            cur.next = cur.next.next;
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = null;

        return res;
    }
}
