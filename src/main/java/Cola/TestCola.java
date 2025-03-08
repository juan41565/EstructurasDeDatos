/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola;

/**
 *
 * @author andre
 */
public class TestCola {
    public static void main(String [] args){
    Cola c= new Cola();
    c.encolar(5);
    c.encolar(4);
    c.encolar(3);
    c.encolar(6);
    c.encolar(8);
    c.encolar(1);
    c.printCola();
    c.desencolar();
    c.desencolar();
    c.desencolar();
    c.printCola();
}
    
}
