/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerPrimerPrevio;


public class TestViaje {
    public static void main(String[] args) {
        Viaje viaje= new Viaje("roberto");
        viaje.añadirGasto(new Gasto("comida",15000));
        viaje.añadirGasto(new Gasto("comida",20000));
        viaje.añadirGasto(new Gasto("comida",35000));
        viaje.añadirGasto(new Gasto("comida",11000));
        viaje.añadirGasto(new Gasto("comida",40000));
        viaje.añadirGasto(new Gasto("ropa",10000));
        viaje.añadirGasto(new Gasto("ropa",19000));
        viaje.añadirGasto(new Gasto("ropa",25000));
        viaje.añadirGasto(new Gasto("ropa",45000));
        viaje.añadirGasto(new Gasto("hospedaje",15500));
        viaje.añadirGasto(new Gasto("hospedaje",12800));
        viaje.añadirGasto(new Gasto("hospedaje",10000));
        viaje.añadirGasto(new Gasto("hospedaje",35600));
        viaje.añadirGasto(new Gasto("transoporte",13000));
        viaje.añadirGasto(new Gasto("transporte",55000));
        viaje.añadirGasto(new Gasto("transporte",12000));
        viaje.añadirGasto(new Gasto("transporte",16000));
        viaje.añadirGasto(new Gasto("transporte",15000));
        viaje.calcularGastos();
        System.out.println("gastos comida: "+ viaje.getComida());
        System.out.println("gastos ropa: "+ viaje.getRopa());
        System.out.println("gastos transporte: "+ viaje.getTransporte());
        System.out.println("gastos Hopedaje: "+ viaje.getHospedaje());
        System.out.println("gasto mayor: "+ viaje.gastoMayor());
       
       
       
    }

    
}
