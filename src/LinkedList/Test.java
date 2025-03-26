/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 *
 */
public class Test {
    public static void main(String[] args){
        LinkedList list= new LinkedList();
        list.addFirst(9);
        list.addFirst(5);
        list.addFirst(7);
        System.out.println("prueba addFirst:");
        list.printList();
        System.out.println("size: "+list.getSize());
        System.out.println("prueba addLast:");
        list.addLast(32);
        list.addLast(4);
        list.addLast(8);
        list.printList();
        System.out.println("size: "+list.getSize());
        System.out.println("prueba addIndex:");
        list.addIndex(1, 10);
        list.printList();
        list.addIndex(0, 20);
        list.printList();
        list.addIndex(8, 30);
        list.printList();
        System.out.println("size: "+list.getSize());
        System.out.println("prueba contains:");
        if(list.contains(2)){
         System.out.println("contains 2");
        }
        else{
          System.out.println("doesnt contain 2");  
        }
        if(list.contains(5)){
         System.out.println("contains 5");
        }
        else{
          System.out.println("doesnt contain 5");  
        }
        System.out.println("prueba get");
        System.out.println("index 0="+list.get(0));
        System.out.println("index 8="+list.get(8));
        System.out.println("index 4="+list.get(4));  
        System.out.println("prueba indexOf");
        System.out.println("indexOf 5="+list.indexOf(5));
        System.out.println("indexOf 20="+list.indexOf(20));
        System.out.println("indexOf 30="+list.indexOf(30));
        System.out.println("prueba remove");
        list.removeFirst();
        list.removeLast();
        list.printList();
        System.out.println("size: "+list.getSize());
        list.remove(2);
        list.printList();
        System.out.println("size: "+list.getSize());
        
        
        
    }
    
}
