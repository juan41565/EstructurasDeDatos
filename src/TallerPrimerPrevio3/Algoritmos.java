/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerPrimerPrevio3;

import GenericLinkedList.LinkedList;

/**
 *
 * @author estudiante
 */
public class Algoritmos {

    public Algoritmos() {
    }

    
    public LinkedList  dividir(LinkedList lista,int x){
        LinkedList aux=new LinkedList();
        for (int i = 0; i <lista.getSize(); i++) {
            if((int)lista.get(i)<x){
                aux.addFirst(lista.get(i));
            }
            else{
                aux.addLast(lista.get(i));
            }
        }
        return aux;
    }
    public double promedio(LinkedList lista){
        double promedio=0;
        int a=0;
        for (int i = 0; i <lista.getSize(); i++) {
            promedio+=(int)lista.get(i);
            a++;
        }
        return promedio/a;
    }
    public LinkedList mayoresPromedio(LinkedList lista, double promedio){
        LinkedList aux= new LinkedList();
        for (int i = 0; i <lista.getSize(); i++) {
            if((int)lista.get(i)>promedio){
                aux.addFirst(lista.get(i));
            }
        }
        return aux;
    }
    public int sumaPares (LinkedList lista){
        int a=0;
        for (int i = 0; i <lista.getSize(); i++) {
            if((int)lista.get(i)%2==0){
                a+=(int)lista.get(i);
            }
        }
        return a;
    }
    public int sumaImpares (LinkedList lista){
        int a=0;
        for (int i = 0; i <lista.getSize(); i++) {
            if((int)lista.get(i)%2!=0){
                a+=(int)lista.get(i);
            }
        }
        return a;
    }
    public boolean iguales(LinkedList lista1,LinkedList lista2){
        boolean a=true;
        for (int i = 0; i <lista1.getSize(); i++) {
            if(lista1.get(i)!=lista2.get(i)){
                a=false;
            }
        }
        return a;
    }
}
