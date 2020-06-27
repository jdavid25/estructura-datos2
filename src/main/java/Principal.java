/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Principal {
    public static void main (String [] args){
        ListaDobles listas = new ListaDobles();
        Cliente cliente1 = new Cliente();
        cliente1.setNombres("juan");
        cliente1.setApellidos("diaz");
        cliente1.setTipoDocumento("C.C.");
        cliente1.setDocumento("1075319938");
        Cliente cliente2 = new Cliente();
        cliente2.setNombres("jose");
        cliente2.setApellidos("perez");
        cliente2.setTipoDocumento("C.C.");
        cliente2.setDocumento("1075319938");
        Cliente cliente3 = new Cliente();
        cliente3.setNombres("pedro");
        cliente3.setApellidos("cruz");
        cliente3.setTipoDocumento("C.C.");
        cliente3.setDocumento("1075319938");
        Cliente cliente4 = new Cliente();
        cliente4.setNombres("maria");
        cliente4.setApellidos("andrade");
        cliente4.setTipoDocumento("C.C.");
        cliente4.setDocumento("1075319938");
        listas.insertarInicio(cliente1);
        listas.insertarFinal(cliente2);
        listas.insertarFinal(cliente3);
        listas.insertarFinal(cliente4);
        listas.mostrar();
        Cliente cliente5 = new Cliente();
        cliente5.setNombres("laura");
        cliente5.setApellidos("sofia");
        cliente5.setTipoDocumento("C.C.");
        cliente5.setDocumento("1075319938");
        listas.AgregarPosicion(2, cliente5);
        System.out.println("#############################################################################");
        System.out.println("#############################################################################");
        System.out.println("#############################################################################");
        listas.mostrar();
    }
    
    
    
    
    
    
    
    
    
    
    
}
