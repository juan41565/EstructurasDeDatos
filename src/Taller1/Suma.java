/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1;

/**
 *
 * @author andre
 */
public class Suma {
    int numeros[];
    int suma;
    
    public Suma(int arreglo[], int suma){
        numeros=arreglo;
        this.suma=suma;
    }
    public void algoritmo(){
        for(int i=0;i<numeros.length;i++){
         for(int j=i+1;j<numeros.length;j++){
             if(numeros[i]+numeros[j]==suma){
                 System.out.println(numeros[i]+"+"+numeros[j]);     
             }
         }
     }

    }
}
