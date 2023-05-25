package com.algorithm;

import com.algorithm.topic.CQueue_LinkedList_implement;
import com.algorithm.topic.CQueue_doubleStack_implement;
import com.algorithm.topic.Fbi;

public class Main {
    public static void main(String[] args) {
        // 斐波那契数列
//        System.out.println(new Fbi().fbi(50));
//        System.out.println(new Fbi().fbiArray02(5));

        // 实现队列
        CQueue_doubleStack_implement obj = new CQueue_doubleStack_implement();
        obj.appendTail(10);
        obj.appendTail(11);
        obj.appendTail(13);
        obj.appendTail(17);
        int param_2 = obj.deletedHead();
        System.out.println(param_2);
    }
}
