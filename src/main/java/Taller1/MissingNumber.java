package Taller1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */
public class MissingNumber {
     int numeros[];
     int a;
    public MissingNumber(){
        numeros = new int[100];
        a=1;
    }
    public int algoritmo(int arreglo []){
        numeros=arreglo;
    for(int i=0;i<numeros.length;i++){
       if(a!=numeros[i]){
           return a; 
       }
       else{
          a++;
       }
    }
    return -1;
}
    
}
