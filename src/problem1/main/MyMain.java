/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class
import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String args[]) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(28);
        obj.insert(20);
        obj.insert(43);
        obj.insert(50);
        obj.insert(60);
        System.out.println("Left children of the tree:");
        obj.traverse();
        System.out.println("Count of nodes who doesn't have left child:");
        System.out.println(obj.getCount());
    }
}
