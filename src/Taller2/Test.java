/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2;

import GenericLinkedList.LinkedList;

/**
 *
 * @author estudiante
 */
public class Test {
    public static void main(String[] args) {
        LinkedList lista=new LinkedList();
        LinkedList lista1=new LinkedList();
        LinkedList lista2=new LinkedList();
        LinkedList mayores=new LinkedList();
        Algoritmos a= new Algoritmos();
        lista.addFirst(2);
        lista.addFirst(8);
        lista.addFirst(7);
        lista.addFirst(4);
        lista.addFirst(1);
        lista.addFirst(5);
        lista=a.dividir(lista, 2);
        lista.printList();
        System.out.println("promedio= "+a.promedio(lista));
        mayores=a.mayoresPromedio(lista, a.promedio(lista));
        System.out.println("mayores al promedio= ");
        mayores.printList();
        System.out.println("suma pares= "+a.sumaPares(lista));
        System.out.println("suma impares= "+a.sumaImpares(lista));
        lista1.addFirst(2);
        lista1.addFirst(4);
        lista1.addFirst(3);
        lista2.addFirst(2);
        lista2.addFirst(4);
        lista2.addFirst(2);
        System.out.println(a.iguales(lista1, lista2));
        
    }
    
}
