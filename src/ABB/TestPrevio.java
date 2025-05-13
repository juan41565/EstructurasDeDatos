/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABB;

/**
 *
 * @author JUAN JOSE
 */
public class TestPrevio {
     public static void main(String[] args) {
         ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();
         ArbolBinarioBusqueda abb2 = new ArbolBinarioBusqueda();
        abb.add(10);
        abb.add(7);
        abb.add(5);
        abb.add(8);
        abb.add(20);
        abb.add(12);
        abb.add(22);
        abb2.add(10);
        abb2.add(7);
        abb2.add(5);
        abb2.add(8);
        abb2.add(20);
        boolean a=abb.iguales(abb.getRaiz(), abb2.getRaiz());
        System.out.println("iguales? "+a);
        abb.clear();
        abb2.clear();
        abb.add(10);
        abb.add(7);
        abb.add(5);
        abb.add(8);
        abb.add(20);
        abb.add(12);
        abb.add(22);
        abb2.add(10);
        abb2.add(7);
        abb2.add(5);
        abb2.add(8);
        abb2.add(20);
        abb2.add(12);
        abb2.add(22);
        a=abb.iguales(abb.getRaiz(), abb2.getRaiz());
        System.out.println("iguales? "+a);
         System.out.println("La suma de los nodos de min 5 y max 10 es: "+abb.sumaNodos(abb.getRaiz(), 5, 10));
         System.out.println("Las hojas de 0 a 13 son: "+abb.hojasRango(abb.getRaiz(), 0, 13));
         System.out.println("La altura del arbol es: "+abb.altura(abb.getRaiz()));
    }
}
