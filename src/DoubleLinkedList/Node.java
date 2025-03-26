/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoubleLinkedList;

/**
 *
 * @author andre
 */
public class Node {
    private int dato;
    private Node next;
    private Node previous;
    
    public Node(){
    
    }
    public Node (int dato){
        this.dato=dato;
    }
    public int getDato(){
        return this.dato;
    }
    public void setDato(int dato){
        this.dato=dato;
    }
    public Node getNext(){
        return this.next;
    }
    public void setNext(Node next){
        this.next=next;
    }
    
    public Node getPrevious(){
        return this.previous;
    }
    public void setPrevious(Node previous){
        this.previous=previous;
    }
    
}
