/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerPrimerPrevio;

import AlgoritmosDeBusqueda.*;
import java.util.Arrays;

/**
 *
 * @author andre
 */
public class Cedula {
   int [] cedulas;

    public Cedula(int[] cedulas) {
        this.cedulas = cedulas;
    }

    public void ordenar(){
        Arrays.sort(cedulas);
    }
    public int buscar(int n){
        return BusquedaBinaria.busquedaBinaria(cedulas,n);        
    }
    public int mayores(int n){
        ordenar();
        return cedulas.length-buscar(n)-1;
    }
       
    public int[] getCedulas() {
        return cedulas;
    }

    public void setCedulas(int[] cedulas) {
        this.cedulas = cedulas;
    }
    
   
    
}
