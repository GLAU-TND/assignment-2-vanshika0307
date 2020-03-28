/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyTree obj = new MyTree();
        obj.insert(30);
        obj.insert(32);
        obj.insert(10);
        obj.insert(37);
        obj.insert(90);
        obj.insert(98);
        obj.insert(26);
        obj.insert(44);
        System.out.println("PreOrder traverse :");
        obj.traversePreOrder(obj.getRoot());
        System.out.println();
        System.out.println("PostOrder traverse :");
        obj.traversePostOrder(obj.getRoot());
        System.out.println("\n");
        System.out.println("Both condition are satisfied");

    }
}
