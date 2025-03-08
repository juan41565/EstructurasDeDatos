/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1;

/**
 *
 * @author andre
 */
public class BiggestSmallestNumber {
    int numeros[];
    int bigSmall[];
    int biggest;
    int smallest;
    public BiggestSmallestNumber(int a[]){
        numeros=a;
        bigSmall= new int [2];
    }
    public int[] algoritmo(){
        biggest=numeros[0];
        smallest=numeros[0];
        for(int i=0;i<numeros.length;i++){
            if(biggest<numeros[i]){
                biggest=numeros[i];
            }
            if(smallest>numeros[i]){
                smallest=numeros[i];
            }
        }
        bigSmall[0]=biggest;
        bigSmall[1]=smallest;
        return bigSmall;
    }
    
}
