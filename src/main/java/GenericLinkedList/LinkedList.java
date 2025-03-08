/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenericLinkedList;


 
 public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public LinkedList() {
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public T getFirst() {
        return head.getDato();
    }

    public T getLast() {
        return tail.getDato();
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean contains(T dato) {
        Node<T> current = head;
        while (current != null) {
            if (current.getDato().equals(dato)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public int indexOf(T dato) {
        int index = 0;
        Node<T> current = head;
        while (current != null) {
            if (current.getDato().equals(dato)) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }

    public T get(int index) {
        if (index == 0) {
            return head.getDato();
        }
        if (index == size - 1) {
            return tail.getDato();
        }
        Node<T> current = head;
        for (int i = 0; i != index; i++) {
            current = current.getNext();
        }
        return current.getDato();
    }

    public void addFirst(T dato) {
        Node<T> newNode = new Node<>(dato);
        if (size == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.setNext(this.head);
            this.head = newNode;
        }
        size++;
    }

    public void addLast(T dato) {
        Node<T> newNode = new Node<>(dato);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public void addIndex(int index, T dato) {
        if (index == 0) {
            addFirst(dato);
            return;
        }
        if (index == size - 1) {
            addLast(dato);
            return;
        }
        Node<T> current = head;
        Node<T> newNode = new Node<>(dato);

        for (int i = 0; i != index - 1; i++) {
            current = current.getNext();
        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        size++;
    }

    public void removeFirst() {
        if (size == 1) {
            clear();
        } else {
            head = head.getNext();
            size--;
        }
    }

    public void removeLast() {
        if (size == 1) {
            clear();
        } else {
            Node<T> current = head;
            while (current.getNext().getNext() != null) {
                current = current.getNext();
            }
            current.setNext(null);
            tail = current;
            size--;
        }
    }

    public void remove(int index) {
        if (index >= size) {
            return;
        }
        Node<T> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        size--;
    }

    public void printList() {
        Node<T> node = this.head;
        while (node != null) {
            System.out.print(node.getDato() + " ");
            node = node.getNext();
        }
        System.out.println();
    }
}