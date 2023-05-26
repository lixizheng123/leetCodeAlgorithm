package com.algorithm.topic;

import java.util.LinkedList;
import java.util.Stack;


/**
 * 包含min的栈
 *  min() pop() push() 时间复杂度都为 O(1)
 */
public class MinStack{
    Stack<Integer> stack;
    Stack<Integer> stack_min;

    public MinStack(){
        stack = new Stack<>();
        stack_min = new Stack<>();
    }

    public int min(){
        return stack_min.peek();
    }

    public void pop(){
        if(!stack.empty()){
            stack.pop();
        }
        if(!stack_min.empty()){
            stack_min.pop();
        }
    }

    public int top(){
        return stack.peek();
    }

    public void push(int num){
        stack.push(num);
        if(stack_min.empty()){
            stack_min.push(num);
        }else{
            if (stack_min.peek() > num) {
                stack_min.pop();
                stack_min.push(num);
            }
        }
    }
}
