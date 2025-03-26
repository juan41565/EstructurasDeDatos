/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerPrimerPrevio;
import java.util.Arrays;

/**
 *
 * @author andre
 */
public class Sistema {
    
    private Estudiantes estudiantes[];
    double promedio;

    public Sistema(Estudiantes[] estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    
    public double getPromedio(){
        promedio=0;
        for (Estudiantes estudiante : estudiantes) {
            promedio += estudiante.getNota();
        }
        promedio/=(estudiantes.length+1);
        return promedio;
    }
    public void ordenar(){
       Arrays.sort(estudiantes, (Estudiantes p1, Estudiantes p2) -> Integer.compare(p1.nota, p2.nota));
     }
    public Estudiantes getMenor(){
        ordenar();
        return estudiantes[0];
    }
    public Estudiantes getMayor(){
        ordenar();
        return estudiantes[estudiantes.length-1];
    }
    
    public int notasAltas(){
        int a=0;
        for (Estudiantes estudiante : estudiantes) {
            if (estudiante.getNota() >= 18) {
                a++;
            }
        }
        return a;
    }
    public int notasArribaPromedio(){
        int a=0;
        for (Estudiantes estudiante : estudiantes) {
            if (estudiante.getNota() > getPromedio()) {
                a++;
            }
        }
        return a;
    }
    public double aprobados(){
        double a=0;
        for (Estudiantes estudiante : estudiantes) {
            if (estudiante.getNota() > 10) {
                a++;
            }
        }
        return (a*100)/(estudiantes.length+1);
    }
    public double reprobados(){
        double a=0;
        for (Estudiantes estudiante : estudiantes) {
            if (estudiante.getNota() <= 10) {
                a++;
            }
        }
        return (a*100)/(estudiantes.length+1);
    }

    public Estudiantes[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiantes[] estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    
    
}
