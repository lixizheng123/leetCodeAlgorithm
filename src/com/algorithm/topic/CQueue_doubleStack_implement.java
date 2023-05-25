package com.algorithm.topic;

import java.util.Stack;

/**
 * 使用java自带的LinkedList实现队列
 */
public class CQueue_doubleStack_implement {
    Stack<Integer> input;
    Stack<Integer> output;

    public CQueue_doubleStack_implement(){
        input = new Stack<>();
        output = new Stack<>();
    }

    // 队头插入数据
    public void appendTail(int number){
        input.add(number);
    }

    // 队尾删除
    public int deletedHead(){
        int temp = -1;
        if(output.empty()){
            output.push(input.peek());
            input.pop();
        }

        if (!output.empty()){
            temp = output.peek();
            output.pop();
        }

        return temp;
    }
}
