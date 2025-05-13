/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABB;

import GenericLinkedList.LinkedList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JUAN JOSE
 */
public class ArbolBinarioBusqueda {

    private Node raiz;

    public void add(int dato) {
        if (raiz == null) {
            raiz = new Node(dato);
        } else {
            raiz.add(dato);
        }
    }

    public void clear() {
        setRaiz(null);
    }

    public void inorden(Node nodo) {
        if (nodo == null) {
            return;
        } else {
            inorden(nodo.getIzquierda());
            System.out.println("Dato: " + nodo.getDato());
            inorden(nodo.getDerecha());
        }

    }

    public void preorden(Node nodo) {
        if (nodo == null) {
            return;
        } else {
            System.out.println("Dato: " + nodo.getDato());
            preorden(nodo.getIzquierda());
            preorden(nodo.getDerecha());
        }
    }

    public void postorden(Node nodo) {
        if (nodo == null) {
            return;
        } else {
            preorden(nodo.getIzquierda());
            preorden(nodo.getDerecha());
            System.out.println("Dato: " + nodo.getDato());
        }
    }

    public void sucesorPredecesor(Node nodo, ArrayList<Integer> lista) {
        if (nodo == null) {
            return;
        } else {

            sucesorPredecesor(nodo.getIzquierda(), lista);
            lista.add(nodo.getDato());
            sucesorPredecesor(nodo.getDerecha(), lista);
        }
    }

    public void getSucesorPredecesor(Node nodo, int n) {
        ArrayList<Integer> lista = new ArrayList();
        sucesorPredecesor(nodo, lista);
        int predecesor = 0;
        int sucesor = 0;
        for (int i = 0; i < lista.size(); i++) {
            int a = lista.get(i);
            if (a == n) {
                predecesor = lista.get(i - 1);
                sucesor = lista.get(i + 1);
                System.out.println("El predecesor de " + n + " es " + predecesor + " el sucesor es " + sucesor);

            }
        }
    }

    public void minMax(Node nodo, int min, int max) {
        if (nodo == null) {
            return;
        } else {
            minMax(nodo.getIzquierda(), min, max);
            if (nodo.getDato() >= max) {
                return;
            }
            if (nodo.getDato() > min) {
                System.out.print(nodo.getDato() + ", ");
            }
            minMax(nodo.getDerecha(), min, max);
        }

    }

    public int sumaNodos(Node nodo, int min, int max) {
        if (nodo == null) {
            return 0;
        }
        int suma = 0;
        if (nodo.getDato() >= min && nodo.getDato() <= max) {
            suma += nodo.getDato();
        }
        suma += sumaNodos(nodo.getIzquierda(), min, max);
        suma += sumaNodos(nodo.getDerecha(), min, max);

        return suma;
    }

    public int hojasRango(Node nodo, int min, int max) {
        if (nodo == null) {
            return 0;
        }
        if (nodo.getDerecha() == null && nodo.getIzquierda() == null && nodo.getDato() > min && nodo.getDato() < max) {
            return 1;
        }
        return hojasRango(nodo.getIzquierda(), min, max) +
        hojasRango(nodo.getDerecha(), min, max);
    }
    public int altura(Node nodo){
        if (nodo == null) {
            return 0;
        }
        int alturaIzq=altura(nodo.getIzquierda())+1;
        int alturaDer=altura(nodo.getDerecha())+1;
        if(alturaIzq>alturaDer){
            return alturaIzq;
        }
        else{
            return alturaDer;
        }
    }

    public void toList(Node nodo, LinkedList<Integer> lista) {
        if (nodo == null) {
            return;
        } else {

            toList(nodo.getIzquierda(), lista);
            lista.addLast(nodo.getDato());
            toList(nodo.getDerecha(), lista);
        }
    }

    public boolean igualEstructura(Node arbol1, Node arbol2) {

        if (arbol1 == null && arbol2 == null) {
            return true;
        }
        if (arbol1 == null && arbol2 != null || arbol1 != null && arbol2 == null) {
            return false;
        }
        if (igualEstructura(arbol1.getIzquierda(), arbol2.getIzquierda())) {
            if (igualEstructura(arbol1.getDerecha(), arbol2.getDerecha())) {
                return true;
            }
        }

        return false;
    }

    public boolean iguales(Node arbol1, Node arbol2) {
        if (arbol1 == null && arbol2 == null) {
            return true;
        }
        if (arbol1 == null && arbol2 != null || arbol1 != null && arbol2 == null) {
            return false;
        }
        if (iguales(arbol1.getIzquierda(), arbol2.getIzquierda())) {
            if (arbol1.getIzquierda() == null && arbol2.getIzquierda() == null || arbol1.getIzquierda().getDato() == arbol2.getIzquierda().getDato()) {
                if (iguales(arbol1.getDerecha(), arbol2.getDerecha())) {
                    if (arbol1.getDerecha() == null && arbol2.getDerecha() == null || arbol1.getDerecha().getDato() == arbol2.getDerecha().getDato()) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public int pesoArbol(Node nodo, int peso) {
        if (nodo == null) {
            return peso;
        }
        peso = pesoArbol(nodo.getIzquierda(), peso);
        peso = pesoArbol(nodo.getDerecha(), peso);
        peso++;
        return peso;
    }

    public int getPesoArbol(Node nodo) {
        return pesoArbol(nodo, 0);
    }

    public int hojas(Node nodo) {
        if (nodo == null) {
            return 0;
        } else {
            if (nodo.getIzquierda() == null && nodo.getDerecha() == null) {
                return 1;
            }
            return hojas(nodo.getIzquierda()) +
            hojas(nodo.getDerecha());
        }
    }

    public int parMayor(Node nodo, int parMayor) {
        if (nodo == null) {
            return parMayor;
        } else {
            if(parMayor<nodo.getDato()&&nodo.getDato()%2==0){
                parMayor=nodo.getDato();
            }
            parMayor=parMayor(nodo.getIzquierda(), parMayor);
            parMayor=parMayor(nodo.getDerecha(), parMayor);
        }
        return parMayor;
    }

    public int getParMayor(Node nodo) {
        return parMayor(nodo, Integer.MIN_VALUE);
    }

    /**
     * @return the raiz
     */
    public Node getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(Node raiz) {
        this.raiz = raiz;
    }

}
