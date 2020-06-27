/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Nodo {

    private Cliente cliente;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(Cliente cliente) {
        this.cliente=cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Nodo getSig() {
        return siguiente;
    }

    public Nodo getAnt() {
        return anterior;
    }

    public void setSig(Nodo sig) {
        siguiente = sig;
    }

    public void setAnt(Nodo ant) {
        anterior = ant;
    }
}
