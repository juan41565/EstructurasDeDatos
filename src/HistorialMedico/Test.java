/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HistorialMedico;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author estudiante
 */
public class Test {
    public static void main(String[] args) {
        LinkedList <String> l=new LinkedList();
        LinkedList <String> t=new LinkedList();
        l.add("pierna rota");
        l.add("fractura brazo");
        ExpedienteMedico e= new ExpedienteMedico("1","juan",new Date(19,7,6),"A+",l);
        HistorialExpediente h= new HistorialExpediente();
        h.agregarExpediente(e);
        
        t.add("cirrosis");
        ExpedienteMedico f= new ExpedienteMedico("2","nicolas",new Date(25,6,3),"O+",t);
        h.agregarExpediente(f);
        System.out.println("Se agregaron 2 expedientes y se imprimen los expedientes");
        h.printExpedientes();
        System.out.println("busqueda expediente 2");
        h.buscarExpediente(f);
        System.out.println("se elimina el expediente 2 y se imprimen los expedientes");
        h.eliminarExpediente(f);
        h.printExpedientes();
        System.out.println("Se actualiza el expediente 1, se cambia el nombre y tipo de sangre");
        e.setNombre("jose");
        e.setTipoSangre("O-");
        h.actualizarExpediente(e);
        h.printExpedientes();
    }
    
}
