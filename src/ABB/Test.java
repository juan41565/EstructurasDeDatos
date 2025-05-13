/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABB;

/**
 *
 * @author JUAN JOSE
 */
public class Test {

    public static void main(String[] args) {
        
        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();
        abb.add(10);
        abb.add(7);
        abb.add(5);
        abb.add(8);
        abb.add(20);
        abb.add(12);
        abb.add(22);
        System.out.println("indorden:");
        abb.inorden(abb.getRaiz());
        System.out.println("Peso: "+abb.getPesoArbol(abb.getRaiz()));
        System.out.println("preorden:");
        abb.preorden(abb.getRaiz());
        System.out.println("hojas: "+ abb.hojas(abb.getRaiz()));
        System.out.println("postorden:");
        abb.postorden(abb.getRaiz());
        System.out.println("Par mayor: "+abb.getParMayor(abb.getRaiz()));
        System.out.println("indorden:");
        abb.inorden(abb.getRaiz());
        System.out.println("Par mayor: "+abb.getParMayor(abb.getRaiz()));
        System.out.println("hojas: "+ abb.hojas(abb.getRaiz()));
        System.out.println("Peso: "+abb.getPesoArbol(abb.getRaiz()));
        
    }

}
