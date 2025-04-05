/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerTienda;

/**
 *
 * @author auxiliarsc
 */
public class Libro {
    private String titulo;
    private String isbn;
    private int precio;

    public Libro() {
    }

    public Libro(String titulo, String isbn, int precio) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.precio = precio;
    }

    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
