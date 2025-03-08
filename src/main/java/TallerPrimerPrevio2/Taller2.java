/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TallerPrimerPrevio2;

import Cola.*;
import Pila.*;


public class Taller2 {
    Pila <Integer> tmp= new Pila();
    Cola <Integer> tmpC=new Cola();

    public Taller2() {
   
    }
    public Pila reemplazar(Pila <Integer> pila, int nuevo, int viejo){
        tmp.clear();
        int a;
        while(pila.getCima()!=null){
            a=pila.desapilar();
            if(a!=viejo){
                tmp.apilar(a);
            }
            else{
                tmp.apilar(nuevo);
            }
        }
        while(tmp.getCima()!=null){
            pila.apilar(tmp.desapilar());
        }
        return pila;
    }
    public Pila ordenado(Pila <Integer> pila){
        tmp.clear();
        int menor=pila.getCima().getDato();
        int a;
        while(pila.getCima()!=null){
            a=pila.getCima().getDato();
            if(menor>a){
                menor=a;
            }
            tmp.apilar(pila.desapilar());
        }
        pila.apilar(menor);
        while(tmp.getCima()!=null){
            if(tmp.getCima().getDato()!=menor){
            pila.apilar(tmp.desapilar());
            }
            else{
                tmp.desapilar();
            }
        }
        return pila;
    }
    public Pila reorganizarPila(Pila <Integer> pila, int n){
        tmp.clear();
        Pila <Integer> tmp2= new Pila();
        boolean existe=false;
        while(pila.getCima()!=null){
            if(n==pila.getCima().getDato()){
                existe=true;
                tmp2.apilar(pila.desapilar());
                break;
            }
            tmp.apilar(pila.desapilar());
        }   
        if(existe){
            while(tmp.getCima()!=null){
            pila.apilar(tmp.desapilar());
           }
           pila.apilar(tmp2.getCima().getDato()); 
        }
        else{
            while(tmp.getCima()!=null){
            pila.apilar(tmp.desapilar());
           }
            pila.apilar(n);
        }
        return pila;
    }
    public Cola reorganizarCola(Cola<Integer> cola,int n){
        tmpC.clear();
        Cola <Integer> tmp2= new Cola();
        boolean existe=false;
        while(cola.getHead()!=null){
            if(n==cola.getHead().getDato()){
                existe=true;
                cola.desencolar();
            }
            else{
            tmpC.encolar(cola.desencolar());
            }
        }   
        cola.encolar(n);
        if(existe){
            while(tmpC.getHead()!=null){
            tmp2.encolar(tmpC.desencolar());
           }
            while(tmp2.getHead()!=null){
            cola.encolar(tmp2.desencolar());
           }
        }
        else{
            while(tmpC.getHead()!=null){
            tmp2.encolar(tmpC.desencolar());
           }
            while(tmp2.getHead()!=null){
            cola.encolar(tmp2.desencolar());
           }
        }
        return cola;
    }
    
   
}
    

