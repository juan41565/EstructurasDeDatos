/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoubleLinkedList;

/**
 *
 * @author andre
 */
public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int size=0;
    
    public DoubleLinkedList(){
        
    } 
    public void clear(){
        head=null;
        tail=null;
        size=0;
    }
    public int getSize(){
        return size;
    }
    public int getFirst(){
        return head.getDato();
    }
    public int getLast(){
        return tail.getDato();
    }
    public boolean isEmpty(){
        boolean empty=false;
        if(head==null){
            empty=true;
        }
        return empty;
    }
    public boolean contains(int dato){
        Node current= head;
        boolean contained=false;
        while(current!= null){
            if(current.getDato() ==dato){
                contained=true;
                break;
            }
            else{
                current=current.getNext();
            }
        }
        return contained;
    }
    public int indexOf(int dato){
        int index=0;
        if(!contains(dato)){
            return -1;
        }
        else{
            Node current= head;
        while(current!= null){
            if(current.getDato() ==dato){
                return index;
            }
            else{
                current=current.getNext();
                index++;
            }
        }
        }
        return -1;
    }
    public int get(int index){
        if (index==0){
           return head.getDato();       
        }
        if(index==size-1){
           return tail.getDato();
        }
        Node current= head;
        for(int i=0;i!=index;i++){
           current=current.getNext();
       }
        return current.getDato();
    }
            
    
    public void addFirst(int dato){
        Node newNode= new Node(dato);
        if(size==0){
            this.head=newNode;
            this.tail=newNode;
        }
        else{
            newNode.setNext(this.head);
            this.head=newNode;
        }
        size++;
    }
    public void addLast(int dato){
        Node newNode=new Node(dato);
        if(size==0){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.setNext(newNode);
            tail=newNode;
        }
        size++;
    }
    public void addIndex(int index, int dato){
        if (index==0){
           addFirst(dato);
           
           return;       
        }
        if(index==size-1){
            addLast(dato);
            
            return;
        }
        Node current=head;
        Node newNode= new Node(dato);
       
       for(int i=0;i!=index-1;i++){
           current=current.getNext();
       }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        size++;
    }
    public void removeFirst(){
        if(size==1){
           clear();
        }
        else{
            head=head.getNext();
            size--;
        }
    }
    public void removeLast(){
        if(size==1){
           clear();
        }
        else{
            Node current=head;
            while(current.getNext().getNext()!=null){
                current=current.getNext();
            }
            current.setNext(null);
            tail=current;
            size--;
        }
    }
    public void remove(int index){
        if(index>=size){
            return;
        }
        Node current= head;
        for(int i=0;i<index--;i++){
            current=current.getNext();
        }
        current.setNext(current.getNext().getNext());
        size--;
    }
    public void printList(){
        Node node=this.head;
        while(node!=null){
            System.out.print(node.getDato()+" ");
            node=node.getNext();
        }
        System.out.println();
    }
    
}
