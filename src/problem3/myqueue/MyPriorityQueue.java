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

    private void sortedAdd(G data) {
        Node<G> node = new Node<>(data);
        for (int i = 0; i < size; i++) {
            Node<G> node1 = getNode(size - i);
            if (node.getData().equals(node1.getData())) {
                node.setNext(node1.getNext());
                node1.setNext(node);
            } else
                continue;
        }
        rear = getNode(size);
        front = getNode(1);
        size++;
    }

    @Override
    public void add(G data) {
        if ((size == 0)) {
            Node<G> node = new Node<G>(data, null);
            front = node;
            rear = node;
            size++;
        } else {
            sortedAdd(data);
        }

    }

    @Override
    public G remove() {
        G data = front.getData();
        front = front.getNext();
        size--;
        return data;
    }

    @Override
    public G peek() {
        G data = front.getData();
        return data;
    }

    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder("[");
        Node<G> temp = front;
        for (int i = 0; i < size && temp != null; i++) {
            G data = temp.getData();
            stringBuilder.append(data);
            stringBuilder.append((i < size - 1) ? "," : "");
            temp = temp.getNext();
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }


}
