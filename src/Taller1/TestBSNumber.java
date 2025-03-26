/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1;

/**
 *
 * @author andre
 */
public class TestBSNumber {
    public static void main(String[] args){
       int numbers[]={0,3,6,1,25,3,78,4,65};
       BiggestSmallestNumber resultado= new BiggestSmallestNumber(numbers);
       int result[]= resultado.algoritmo();
       System.out.println("numero mas grande y numero mas pequeño: "+ result[0]+" y "+result[1]);
       
    }
    
}
