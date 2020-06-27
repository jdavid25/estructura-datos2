/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class ListaDobles {

    private Nodo primero;
    private Nodo ultimo;
    private int numElem;

    public ListaDobles() {
        ultimo = null;
        primero = null;
        numElem = 0;
    }

    public void insertarInicio(Cliente cliente) {
        Nodo nuevo = new Nodo(cliente);
        if (primero == null) {
            primero = nuevo;
        } else {
            nuevo.setSig(primero);
            primero.setAnt(nuevo);
            primero = nuevo;
        }

        numElem++;
    }

    public void insertarFinal(Cliente cliente) {
        Nodo nuevo = new Nodo(cliente);
        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo aux = primero;
            while (aux.getSig() != null) {
                aux = aux.getSig();

            }
            aux.setSig(nuevo);
            nuevo.setAnt(aux);

        }
        ultimo=nuevo;
        numElem++;
    }

    public void AgregarPosicion(int index, Cliente cliente) {
        int i=1;
        if(index<=numElem){
            Nodo aux = primero;
            Nodo ant =null;
            Nodo rest=null;
            while(aux!=null){
                 if(i<(index-1)){
                     aux=aux.getSig();
                     i++;
                 }else{
                     rest=aux.getSig();
                     aux.setSig(null);
                     ant=aux;
                     Nodo nuevo = new Nodo(cliente);
                     aux = nuevo;
                     aux.setAnt(ant);
                     ant.setSig(aux);
                     aux.setSig(rest);
                     System.out.println(aux.getCliente().getNombres());
                     break;
                 }
                 
            }
        }
        numElem++;
    }

    public void eliminaValor(Cliente cliente) {
        if (primero != null) {
            Nodo aux = primero;
            Nodo ant = null;
            while (aux != null) {
                if (aux.getCliente()== cliente) {
                    if (ant == null) {
                        primero = primero.getSig();
                        aux.setSig(null);
                        aux = primero;

                    } else {
                        ant.setSig(aux.getSig());
                        aux.setSig(null);
                        aux = ant.getSig();
                    }
                } else {
                    ant = aux;
                    aux = aux.getSig();
                }
            }
        }

    }
    
    
    public void mostrar(){
        Nodo aux=primero;
        while(aux!=null){
            System.out.println("··················································");
            System.out.println("nombre: " +aux.getCliente().getNombres());
            System.out.println("apellido: " +aux.getCliente().getApellidos());
            System.out.println("··················································");
            aux=aux.getSig();
        }
    }
}


