/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;

public class Node<G> {
    private G data;
    private Node<G> next;

    public Node(G data, Node<G> next) {
        this.data = data;
        this.next = next;
    }

    public Node(G data) {
        this.data = data;
    }

    public G getData() {
        return data;
    }

    public void setData(G data) {
        this.data = data;
    }

    public Node<G> getNext() {
        return next;
    }

    public void setNext(Node<G> next) {
        this.next = next;
    }

}

