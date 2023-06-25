package com.algorithm.topic;

/**
 * 树的子结构
 * 输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 * 给定的树 A:
 *       3
 *     / \
 *    4   5
 *   / \
 *  1   2
 *给定的树 B：
 *     4
 *   /
 *  1
 * 输入：A = [1,2,3], B = [3,1]
 * 输出：false
 *
 * 输入：A = [3,4,5,1,2], B = [4,1]
 * 输出：true
 *
 */
public class IsSubStructure {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        TreeNode temp_a = A;
        TreeNode temp_b = B;

        while (temp_a != null && temp_b != null){
            assert temp_a.left != null;
            assert temp_a.right != null;
            assert temp_b.left != null;
            assert temp_b.right != null;


            if(temp_a.left.val == temp_b.left.val){
                temp_a = temp_a.left;
                temp_b = temp_b.left;
            }
            if(temp_a.right.val == temp_b.right.val){

            }
        }

        return false;
    }
}
