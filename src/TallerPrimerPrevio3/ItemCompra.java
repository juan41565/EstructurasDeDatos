/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerPrimerPrevio3;

/**
 *
 * @author auxiliarsc
 */
public class ItemCompra {
   private int cantidad;
    Libro libro= new Libro();

    public ItemCompra() {
    }

    public ItemCompra(Libro libro,int cantidad) {
        this.libro=libro;
        this.cantidad = cantidad;
    }

    
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    
}
