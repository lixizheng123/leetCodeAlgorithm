package com.algorithm.topic;

import java.util.LinkedList;

/**
 * 使用java自带的LinkedList实现队列
 */
public class CQueue_LinkedList_implement {
    LinkedList<Integer> list = new LinkedList<>();

    public CQueue_LinkedList_implement(){

    }

    // 队头插入数据
    public void appendTail(int number){
        list.add(number);
    }

    // 队尾删除
    public int deletedHead(){
        return list.size() == 0 ? -1 : list.removeFirst();
    }
}
