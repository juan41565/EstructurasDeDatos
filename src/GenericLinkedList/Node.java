/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenericLinkedList;

/**
 *

 */
public class Node<T> {
        private T dato;
        private Node<T> next;

        public Node(T dato) {
            this.dato = dato;
            this.next = null;
        }

        public T getDato() {
            return dato;
        }

        public void setDato(T dato) {
            this.dato = dato;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }