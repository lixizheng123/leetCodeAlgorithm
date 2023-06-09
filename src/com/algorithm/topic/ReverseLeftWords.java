package com.algorithm.topic;

/**
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 * 请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 *
 * 输入: s = "abcdefg", k = 2
 * 输出: "cdefgab"
 */
public class ReverseLeftWords {
    // 字符串切片
    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }
    // 列表遍历
    public String reverseLeftWords_List(String s, int n){
        StringBuilder sb = new StringBuilder();
        for (int i = n; i < s.length(); i++ ){
            sb.append(s.charAt(i));
        }
        for (int i = 0; i < n ; i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    // 字符串遍历拼接
    public String reverseLeftWords_Str(String s, int n){
        String res = "";
        for (int i = n; i < s.length(); i++ ){
            res += s.charAt(i);
        }
        for (int i = 0; i < n ; i++){
            res += s.charAt(i);
        }
        return res;
    }
}
