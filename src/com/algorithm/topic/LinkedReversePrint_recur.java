package com.algorithm.topic;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归实现
 */
public class LinkedReversePrint_recur {
    List<Integer> temp = new ArrayList<>();

    public void reversePrint(List_node head){
        recur(head);
    }

    public static void main(String[] args) {
        List_node list_node1 = new List_node(10);
        List_node list_node2 = new List_node(20);
        List_node list_node3 = new List_node(24);
        list_node1.next = list_node2;
        list_node2.next = list_node3;

        LinkedReversePrint_recur linkedReversePrint_recur = new LinkedReversePrint_recur();
        // 递归实现
        linkedReversePrint_recur.reversePrint(list_node1);
        System.out.println(linkedReversePrint_recur.temp);
    }

    public void recur(List_node head){
        if(head == null) return;
        recur(head.next);
        temp.add(head.val);
    }
}
