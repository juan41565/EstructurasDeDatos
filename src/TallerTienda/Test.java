/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerTienda;

/**
 *
 * @author auxiliarsc
 */
public class Test {
    public static void main(String[] args) {
        Tienda tienda= new Tienda();
        Libro a= new Libro("principito","1",1000);
        Libro b= new Libro("caperucita roja","2",2000);
        Libro c= new Libro("hansel y gretel","3",1000);
        Libro d= new Libro("3 cerditos","4",1000);
        Libro e= new Libro("peter pan","5",1000);
        Libro f= new Libro("la leyenda de aang","6",1000);
        Libro g= new Libro("cien años de soledad","7",1000);
        Libro h= new Libro("libro de cocina","8",1000);
        tienda.addCatalogo(a);
        tienda.addCatalogo(b);
        tienda.addCatalogo(c);
        tienda.addCatalogo(d);
        tienda.addCatalogo(e);
        tienda.addCatalogo(f);
        tienda.addCatalogo(g);
        tienda.addCatalogo(h);
        System.out.println("prueba catalogo");
        tienda.printCatalogo();
        System.out.println("");
        System.out.println("prueba carrito");
        System.out.println("");
        tienda.addCarrito(a);
        tienda.addCarrito(b);
        tienda.addCarrito(c);
        tienda.addCarrito(a);
        tienda.addCarrito(a);
        tienda.addCarrito(b);
        tienda.printCarrito();
        System.out.println("");
        System.out.println("prueba eliminando caperucita ");
        tienda.retirarCarrito(b);
        tienda.printCarrito();
        System.out.println("prueba eliminando otro caperucita ");
        tienda.retirarCarrito(b);
        tienda.printCarrito();
    }
}
