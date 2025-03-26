/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola;


public class Cola <E>{
    private Node <E> head;
    private Node <E> tail;
    private int size=0;
    
    public Cola(){
        
    }
    public void clear(){
        head=null;
        tail=null;
        size=0;
        
       
    }
  
    public void encolar(E dato) {
    Node<E> nuevo = new Node<>(dato); 

    if (size == 0) { 
        head = nuevo;
        tail = nuevo;
    } else {
        tail.setNext(nuevo);
        tail = nuevo;      
    }

    size++; 
}

    public E desencolar() {
    if (head == null) { 
        return null;
    }
    
    Node<E> temporal = head; 
    head = head.getNext();   
    
    if (head == null) { 
        tail = null;
    }
    
    size--;
    return temporal.getDato(); 
}

    public void printCola(){
        Node node=this.head;
        while(node!=null){
            System.out.print(node.getDato()+" ");
            node=node.getNext();
        }
        System.out.println();
    }

    public Node<E> getHead() {
        return head;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }

    public Node<E> getTail() {
        return tail;
    }

    public void setTail(Node<E> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}
