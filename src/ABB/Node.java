/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABB;

public class Node {

    private int dato;
    private Node izquierda;
    private Node derecha;

    public Node(int dato) {
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
    }

    public void add(int elemento) {
        if (elemento < dato) {
            if (izquierda == null) {
                izquierda = new Node(elemento);
            }
            else{
                izquierda.add(elemento);
            }
        }
        else if (elemento > dato) {
            if (derecha == null) {
                derecha = new Node(elemento);
            }
            else{
                derecha.add(elemento);
            }
        }
    }
    

    public Node getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Node izquierda) {
        this.izquierda = izquierda;
    }

    public Node getDerecha() {
        return derecha;
    }

    public void setDerecha(Node derecha) {
        this.derecha = derecha;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

}
