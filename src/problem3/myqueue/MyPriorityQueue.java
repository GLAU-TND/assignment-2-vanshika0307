/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.ADT.QueueAdt;
import problem3.node.Node;

public class MyPriorityQueue<G> implements QueueAdt<G> {
    private int size = 0;
    private Node<G> front;
    private Node<G> rear;

    private Node<G> getNode(int index) {
        Node<G> response = front;
        if (index < 0 && index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else {
            for (int i = 1; i < index && front != null; i++) {
                response = response.getNext();

            }
        }
        return response;
    }


}
