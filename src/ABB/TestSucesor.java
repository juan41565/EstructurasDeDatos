/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABB;

import GenericLinkedList.LinkedList;


/**
 *
 * @author JUAN JOSE
 */
public class TestSucesor {
    public static void main(String[] args) {
         ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();
         ArbolBinarioBusqueda abb2 = new ArbolBinarioBusqueda();
         LinkedList <Integer> lista = new LinkedList();
        abb.add(10);
        abb.add(7);
        abb.add(5);
        abb.add(8);
        abb.add(20);
        abb.add(12);
        abb.add(22);
        abb.getSucesorPredecesor(abb.getRaiz(), 7);
        abb.minMax(abb.getRaiz(), 7, 12);
        abb.toList(abb.getRaiz(), lista);
        System.out.println();
        lista.printList();
        abb2.add(10);
        abb2.add(7);
        abb2.add(5);
        abb2.add(8);
        abb2.add(20);
        abb2.add(12);
        abb2.add(22);
        boolean a=abb.iguales(abb.getRaiz(), abb2.getRaiz());
        System.out.println("iguales? "+a);
    }
    
}
