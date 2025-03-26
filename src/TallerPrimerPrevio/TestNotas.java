/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerPrimerPrevio;

/**
 *
 * @author andre
 */
public class TestNotas {
    public static void main(String[] args) {
        // Crear un arreglo de 58 objetos Estudiantes con notas de 1 a 20
        Estudiantes[] estudiantes = {
            new Estudiantes("Juan", 15),
            new Estudiantes("Ana", 20),
            new Estudiantes("Luis", 8),
            new Estudiantes("Sofia", 18),
            new Estudiantes("Carlos", 10),
            new Estudiantes("María", 14),
            new Estudiantes("Pedro", 19),
            new Estudiantes("Lucía", 5),
            new Estudiantes("José", 12),
            new Estudiantes("Clara", 17),
            new Estudiantes("Fernando", 9),
            new Estudiantes("Marta", 13),
            new Estudiantes("Raúl", 16),
            new Estudiantes("Sara", 7),
            new Estudiantes("Elena", 8),
            new Estudiantes("Andrés", 19),
            new Estudiantes("Natalia", 15),
            new Estudiantes("Tomás", 6),
            new Estudiantes("Laura", 18),
            new Estudiantes("Alberto", 12),
            new Estudiantes("Patricia", 9),
            new Estudiantes("Jorge", 14),
            new Estudiantes("Sandra", 17),
            new Estudiantes("Ricardo", 11),
            new Estudiantes("Diana", 16),
            new Estudiantes("Francisco", 10),
            new Estudiantes("Paula", 13),
            new Estudiantes("Manuel", 9),
            new Estudiantes("Isabel", 7),
            new Estudiantes("Hugo", 15),
            new Estudiantes("Cristina", 20),
            new Estudiantes("Álvaro", 4),
            new Estudiantes("Camila", 5),
            new Estudiantes("Víctor", 3),
            new Estudiantes("Rosa", 19),
            new Estudiantes("Carmen", 18),
            new Estudiantes("Diego", 8),
            new Estudiantes("Beatriz", 16),
            new Estudiantes("Pablo", 13),
            new Estudiantes("Esteban", 17),
            new Estudiantes("Irene", 6),
            new Estudiantes("Emilio", 17),
            new Estudiantes("Silvia", 20),
            new Estudiantes("Gabriel", 10),
            new Estudiantes("Daniel", 14),
            new Estudiantes("Vanessa", 11),
            new Estudiantes("Adriana", 18),
            new Estudiantes("Gustavo", 8),
            new Estudiantes("Ángela", 15),
            new Estudiantes("Noelia", 12),
            new Estudiantes("Miguel", 19),
            new Estudiantes("Fátima", 9),
            new Estudiantes("Sebastián", 20),
            new Estudiantes("Valeria", 6),
            new Estudiantes("Javier", 7),
            new Estudiantes("Alejandra", 8)
        };
 
        Sistema s= new Sistema(estudiantes);
        s.ordenar();
        System.out.println("Las notas son: ");
        for (Estudiantes estudiante : s.getEstudiantes()) {
            System.out.println(estudiante.getNota() + " " + estudiante.getNombre());
        }
        System.out.println("El promedio de notas es: "+s.getPromedio());
        System.out.println("La mayor nota es: "+s.getMayor().getNota()+ " de "+ s.getMayor().getNombre());
        System.out.println("La menor nota es: "+s.getMenor().getNota()+ " de "+ s.getMenor().getNombre());
        System.out.println("La cantidad de notas de 18 para arriba fue: "+s.notasAltas());
        System.out.println("La cantidad de notas arriba del promedio fue: "+s.notasArribaPromedio());
        System.out.println("El porcentaje de aprobados fue: "+s.aprobados());
        System.out.println("El porcentaje de reprobados fue: "+s.reprobados());
        
    }
}
