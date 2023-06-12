﻿# 力扣算法训练

## 复杂链表复制 
- 题目：请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，
- 每个节点除了有一个 next 指针指向下一个节点，
- 还有一个 random 指针指向链表中的任意节点或者 null。
- 实现方法: 
  1. 哈希表：借助Hash表来建立链表中节点和新节点的映射关系，之后遍历节点。
  时间空间复杂度：O(n)
  2. 拼接 + 拆分
   - 复制各个节点并构建拼接表
   - 构建各新节点的random指向
   - 拆分两链表
  
## 请替换空格
- 题目：请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
- 实现方法:
    1. replace() api实现替换
    2. 创建新串并遍历原串拼接替换

## 字符串左旋
- 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
- 请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，
- 该函数将返回左旋转两位得到的结果"cdefgab"
- 实现方法：
    1. substring(int begin,int end)截取拼接
    2. 创建字符串或者StringBuilder列表遍历拼接
  
## 整型数组查找重复数字
- 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。 
数组中某些数字是重复的，但不知道有几个数字重复了，
也不知道每个数字重复了几次。 请找出数组中任意一个重复的数字。
- 实现方法
  1. 通过哈希表借助HasSet()来实现
  2. 原地交换 通过数组建立索引和值的对应关系来查找，需要满足给定数据数组中最大数据要小于数组长度

## 递增数列 0～n-1 中缺失的数字
- 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。
在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
- 实现方法：
  1. 穷举
  2. 采用二分法比较

## 二维数组中的查找
- 在一个 n * m 的二维数组中，每一行都按照从左到右 非递减 的顺序排序，
每一列都按照从上到下 非递减 的顺序排序。请完成一个高效的函数，
输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
- 实现方法：
    1. 穷举遍历二维数组
    2. 遍历出一维数组后采用二分法查找目标值
    3. 二叉搜索树 
## 第一个只出现一次的字符
- 在字符串 s 中找出第一个只出现一次的字符。
- 如果没有，返回一个单空格。 s 只包含小写字母。
- 实现方法:
    1. 使用哈希表或者有序哈希表实现

## 从上到下打印出二叉树
-  从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
* <p>
* 给定二叉树: [3,9,20,null,null,15,7],
* 3
* / \
* 9  20
* /  \
* 15   7
* 实现方法：
   1. 借助队列实现 BFS层序遍历