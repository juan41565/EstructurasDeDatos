/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1;


public class TestMissingNumber {
    public static void main(String[] args){
       int[] numbers= new int[100];
       int missingNumber=54;
       int index=1;
     
       for(int i=1;i<=100;i++){
           if(index!=missingNumber){
               numbers[i-1]=index;
               index++;
           }
           else{
               index++;
           
           }
       }
       MissingNumber result = new MissingNumber();
       int resultado= result.algoritmo(numbers);
       System.out.println("numero faltante encontrado: "+ resultado);
       
       
    }
    
}
