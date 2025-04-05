/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HistorialMedico;

import java.util.Hashtable;

/**
 *
 * @author estudiante
 */
public class HistorialExpediente {

    private Hashtable<String, ExpedienteMedico> expedientes;

    public HistorialExpediente() {
        expedientes = new Hashtable<>();
    }

    public HistorialExpediente(Hashtable<String, ExpedienteMedico> expedientes) {
        this.expedientes = expedientes;
    }

    public void agregarExpediente(ExpedienteMedico expediente) {
        expedientes.put(expediente.getId(), expediente);
    }

    public void buscarExpediente(ExpedienteMedico expediente) {
        if (expedientes.containsKey(expediente.getId())) {
            System.out.println("El expediente "+expediente.getId()+" existe");
        }
        else{
        System.out.println("no existe");
        }
    }

    public void eliminarExpediente(ExpedienteMedico expediente) {
        expedientes.remove(expediente.getId());

    }

    public void actualizarExpediente(ExpedienteMedico expediente) {
        expedientes.put(expediente.getId(), expediente);
    }

    public void printExpedientes() {
        
        for (String id : expedientes.keySet()) {
            expedientes.get(id).print();
        }

        
    }

    public Hashtable<String, ExpedienteMedico> getExpedientes() {
        return expedientes;
    }

    public void setExpedientes(Hashtable<String, ExpedienteMedico> expedientes) {
        this.expedientes = expedientes;
    }

}
