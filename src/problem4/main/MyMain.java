/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem4.Node.TreeNode;
import problem4.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyBinarySearchTree obj = new MyBinarySearchTree();
        MyQueue myQueue = new MyQueue();
        TreeNode root;
        root = new TreeNode(10);
        obj.insert(root, 6);
        obj.insert(root, 0);
        obj.insert(root, 17);
        obj.insert(root, 10);
        obj.insert(root, 7);
        obj.insert(root, 15);
        obj.insert(root, 35);
        obj.insert(root, 25);
        obj.insert(root, 43);
        obj.insert(root, 45);
        obj.insert(root, 3);
        myQueue.preOrder(root);
        myQueue.queuePrint(myQueue);
        System.out.print("Enter value of which you want to find preOrder Successor : ");
        myQueue.printSuccessor(scanner.nextInt());
    }
}
