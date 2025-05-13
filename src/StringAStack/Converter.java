/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringAStack;

import java.util.Stack;

/**
 *
 * @author JUAN JOSE
 */
public class Converter {

    Stack<String> moves = new Stack();
    String allMoves;
    StringBuilder current = new StringBuilder();

    public Converter(String allMoves) {
        this.allMoves = allMoves;
    }

   public void algoritmo(){
      for (int i = 0; i < allMoves.length(); i++) {
                    char c=allMoves.charAt(i);
                    if(c==' '){
                       moves.push(current.toString()); 
                       current.setLength(0);
                    }
    else{
    current.append(c);
}
                }
   }
   public void printStack(){
       System.out.println(moves);
   }
}
