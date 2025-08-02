package collection;

public class LinkedList<T> {
    int size = 0;
    Node<T> head = null;
    Node<T> tail = null;

    public void add(T value) {
        Node<T> element = new Node<>(value);
        if (size == 0) {
            this.head = element;
            this.tail = element;
        }
        this.tail.next = element;
        this.tail = element;
        size++;
    }

    public void showAll() {
        Node<T> currentNode = this.head;
        while (true) {
            System.out.println(currentNode.value);
            if (currentNode.next == null) break;
            currentNode = currentNode.next;
        }
    }
}
