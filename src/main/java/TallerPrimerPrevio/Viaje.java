/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerPrimerPrevio;

import GenericLinkedList.*;
public class Viaje {
    private String Nombre;
    LinkedList<Gasto> gastos = new LinkedList<>();
    private int comida;
    private int ropa;
    private int hospedaje;
    private int transporte;
    public Viaje(String Nombre) {
        this.Nombre = Nombre;
    }
    public void añadirGasto(Gasto gasto){
        this.gastos.addLast(gasto);
    }
    public void calcularGastos(){
        for(int i=0;i<gastos.getSize();i++){
            Gasto gasto= gastos.get(i);
            if(gasto.getTipo().equals("comida")){
                comida+=gasto.getValor();
            }
            if(gasto.getTipo().equals("ropa")){
                ropa+=gasto.getValor();
            }
            if(gasto.getTipo().equals("transporte")){
                transporte+=gasto.getValor();
            }
            if(gasto.getTipo().equals("hospedaje")){
                hospedaje+=gasto.getValor();
            }
           
        }
    }
    public String gastoMayor(){
        int mayor=comida;
        String tipo="comida";
        if(mayor<hospedaje){
            mayor=hospedaje;
            tipo="hospedaje";
        }
        if(mayor<ropa){
            mayor=ropa;
            tipo="ropa";
        }
        if(mayor<transporte){
          mayor=transporte;
          tipo="transporte";
        }
        return tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public LinkedList<Gasto> getGastos() {
        return gastos;
    }

    public void setGastos(LinkedList<Gasto> gastos) {
        this.gastos = gastos;
    }

    public int getComida() {
        return comida;
    }

    public void setComida(int comida) {
        this.comida = comida;
    }

    public int getRopa() {
        return ropa;
    }

    public void setRopa(int ropa) {
        this.ropa = ropa;
    }

    public int getHospedaje() {
        return hospedaje;
    }

    public void setHospedaje(int hospedaje) {
        this.hospedaje = hospedaje;
    }

    public int getTransporte() {
        return transporte;
    }

    public void setTransporte(int transporte) {
        this.transporte = transporte;
    }

   
   
   
}

