/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1;

/**
 *
 * @author andre
 */
public class NumeroDuplicado {
     int numeros[];
     public NumeroDuplicado(int a[]){
         numeros=a;
     }
    public int algoritmo(){
     for(int i=0;i<numeros.length;i++){
         for(int j=i+1;j<numeros.length;j++){
             if(numeros[i]==numeros[j]){
                 return numeros[i];
             }
         }
     }
     return -1;
    }
  
}
