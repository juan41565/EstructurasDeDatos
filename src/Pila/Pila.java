/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;

public class Pila <E>{
    private Node <E> cima;
    private int size=0;
    public Pila(){
       
    }
    public void clear(){
        cima=null;
        size=0;
        
       
    }
    public void apilar(E dato){
        if(cima==null){
            Node <E> nuevo = new Node(dato);
            cima=nuevo;
            size++;
        }
        else{
            Node <E> nuevo = new Node(dato);
            nuevo.setNext(cima);
            cima=nuevo;
            size++;
        }
       
    }
    public E desapilar(){
        if(size!=0){
            Node <E> temporal=cima;
            temporal.setDato(cima.getDato());
            cima=cima.getNext();
            size--;
            return temporal.getDato();
        }
        else{
            return null;
        }
    }
    public void printPila(){
        Node node=this.cima;
        while(node!=null){
            System.out.print(node.getDato()+" ");
            node=node.getNext();
        }
        System.out.println();
    }

    public Node<E> getCima() {
        return cima;
    }

    public void setCima(Node<E> cima) {
        this.cima = cima;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
   
   
}