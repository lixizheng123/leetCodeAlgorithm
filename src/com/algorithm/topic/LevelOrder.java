package com.algorithm.topic;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 * <p>
 * 给定二叉树: [3,9,20,null,null,15,7],
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 */
public class LevelOrder {

    // 层序遍历二叉树 BFS 借助队列
    public int[] leveOrder(TreeNode root) {
        if(root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> list = new ArrayList<>();

        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node != null){
                list.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public List<List<Integer>> leveOder2(TreeNode root){
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        List<List<Integer>> list = new ArrayList<>();
        while (!queue.isEmpty()){
            List<Integer> arrayList = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--){
                TreeNode poll = queue.poll();
                if(poll != null) {
                    arrayList.add(poll.val);
                    if (poll.left != null) queue.add(poll.left);
                    if (poll.right != null) queue.add(poll.right);
                }
            }
            list.add(arrayList);
        }
        return list;
    }

    public List<List<Integer>> leveOder3(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root != null) queue.add(root);
        while(!queue.isEmpty()) {
            LinkedList<Integer> tmp = new LinkedList<>();
            for(int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                assert node != null;
                if(res.size() % 2 == 0) {
                    tmp.addLast(node.val);
                }
                else {
                    tmp.addFirst(node.val);
                }
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            res.add(tmp);
        }
        return res;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}