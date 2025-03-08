/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerPrimerPrevio2;

import Cola.*;
import Pila.*;

public class TestTaller2 {
    public static void main(String[] args){
        Taller2 o= new Taller2();
        Pila<Integer> p= new Pila();
        Cola<Integer> c=new Cola();
        System.out.println("Test reemplazar");
        p.apilar(5);
        p.apilar(2);
        p.apilar(8);
        p.apilar(6);
        p.apilar(4);
        System.out.println("Pila original");
        p.printPila();
        p=o.reemplazar(p, 7, 2);
        System.out.println("Pila reemplazando el 2 por 7");
        p.printPila();
        System.out.println("Test ordenar");
        p.clear();
        p.apilar(2);
        p.apilar(5);
        p.apilar(8);
        p.apilar(4);
        p.apilar(2);
        p.apilar(2);
        p.apilar(4);
        p.apilar(6);
        System.out.println("Pila original");
        p.printPila();
        p=o.ordenado(p);
        System.out.println("Pila ordenada");
        p.printPila();
        p.clear();
        System.out.println("Test reorganizar pila");
        p.apilar(2);
        p.apilar(6);
        p.apilar(3);
        p.apilar(5);
        p.apilar(9);
        p.apilar(1);
        System.out.println("Pila original");
        p.printPila();
        p=o.reorganizarPila(p, 2);
        System.out.println("Pila reorganizada");
        p.printPila();
        System.out.println("Test reorganizar cola");
        c.encolar(5);
        c.encolar(4);
        c.encolar(3);
        c.encolar(6);
        c.encolar(8);
        c.encolar(1);
        System.out.println("cola original");
        c.printCola();
        c=o.reorganizarCola(c, 8);
        System.out.println("cola reorganizada");
        c.printCola();
    }
}
