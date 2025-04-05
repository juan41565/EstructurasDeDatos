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
public class ExpedienteMedico {

    private String id;
    private String nombre;
    private Date fechaNacimiento;
    private String tipoSangre;
    private LinkedList<String> historialMedico;

    public ExpedienteMedico() {
    }

    public ExpedienteMedico(String id, String nombre, Date fechaVencimiento, String tipoSangre, LinkedList<String> historialMedico) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaVencimiento;
        this.tipoSangre = tipoSangre;
        this.historialMedico = historialMedico;
    }
    public void print(){
        System.out.println("Id: "+id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Fecha Nacimiento: "+fechaNacimiento);
        System.out.println("tipoSangre: "+tipoSangre);
        for (String string : historialMedico) {
            System.out.println(string);
        }
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaVencimiento) {
        this.fechaNacimiento = fechaVencimiento;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public LinkedList<String> getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(LinkedList<String> historialMedico) {
        this.historialMedico = historialMedico;
    }

}
