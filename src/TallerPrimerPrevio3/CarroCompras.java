/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.ArrayList;

/**
 *
 * @author auxiliarsc
 */
public class CarroCompras {
    ArrayList <ItemCompra> items= new ArrayList();

    public CarroCompras() {
    }
    
    public void addLibro(Libro libro){
        for(int i=0;i<items.size();i++){
            if(items.get(i).getLibro().getIsbn().equals(libro.getIsbn())){
                int a=items.get(i).getCantidad();
                items.get(i).setCantidad(a++);
                return;
            }
        }
        ItemCompra item= new ItemCompra(libro,1);
        items.add(item);
    }

    public int retirarLibro(Libro libro){
        int a=-1;
        for(int i=0;i<items.size();i++){
            if(items.get(i).getLibro().getIsbn().equals(libro.getIsbn())){
                a=i;
                items.remove(i);
                return a;
            }
        }
        return a;
    }
    public void printCarro(){
        for(int i=0;i<items.size();i++){
            System.out.println(items.get(i).getLibro().getTitulo());
        }
    }
    public ArrayList<ItemCompra> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemCompra> items) {
        this.items = items;
    }

   
    
}
