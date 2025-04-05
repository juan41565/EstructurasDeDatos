/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TallerTienda;

import java.util.ArrayList;

/**
 *
 * @author auxiliarsc
 */
public class Tienda {
    ArrayList<Libro> catalogo= new ArrayList();
   CarroCompras carrito=new CarroCompras();

    public Tienda() {
    }

    public void addCatalogo(Libro libro){
        catalogo.add(libro);
    }
    public void addCarrito(Libro libro){
        carrito.addLibro(libro);
    }
    public int retirarCarrito(Libro libro){
        return carrito.retirarLibro(libro);
    }
    public void printCatalogo(){
        for(int i=0;i<catalogo.size();i++){
            System.out.println(catalogo.get(i).getTitulo());
        }
    }
    public void printCarrito(){
        carrito.printCarro();
    }
    
    public ArrayList<Libro> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<Libro> catalogo) {
        this.catalogo = catalogo;
    }

    public CarroCompras getCarrito() {
        return carrito;
    }

    public void setCarrito(CarroCompras carrito) {
        this.carrito = carrito;
    }
    
}
