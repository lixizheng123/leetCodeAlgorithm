package com.algorithm.topic;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 剑指 Offer 50. 第一个只出现一次的字符
 *
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 *
 * 输入：s = "abaccdeff"
 * 输出：'b'
 *
 * 输入：s = ""
 * 输出：' '
 */
public class FirstUniqChar {
    // hash表 建立元素对应关系
    public char firstUniqChar(String s){
        HashMap<Character, Boolean> dic = new HashMap<>();
        char[] chars = s.toCharArray();

        for (char c :
                chars) {
            dic.put(c, !dic.containsKey(c));
        }
        for (char c :
                chars) {
            if(dic.get(c)) return c;
        }

        return ' ';
    }

    // 有序Hash表
    public char firstUniqChar2(String s){
        HashMap<Character, Boolean> dic = new LinkedHashMap<>();
        char[] chars = s.toCharArray();

        for (char c :
                chars) {
            dic.put(c, !dic.containsKey(c));
        }
       for (Map.Entry<Character, Boolean> d: dic.entrySet()){
           if(d.getValue()) return d.getKey();
       }
        return ' ';
    }
}
