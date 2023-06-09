package com.algorithm;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class ReplaceSpace {
    public String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }

    public String replaceSpace_list(String s) {
        char[] chars = s.toCharArray();
        StringBuilder temp = new StringBuilder();
        for (char c :
                chars) {
            if (c == ' ') {
                temp.append("%20");
            }else {
                temp.append(c);
            }
        }
        return temp.toString();
    }
}
