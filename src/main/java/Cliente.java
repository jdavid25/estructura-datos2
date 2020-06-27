/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Cliente {
    
    private String nombres;
    private String apellidos;
    private String documento;
    private String tipoDocumento;

    public String getNombres() {
        return nombres;
    }

    public Cliente setNombres(String nombres) {
        this.nombres = nombres;
        return this;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Cliente setApellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public String getDocumento() {
        return documento;
    }

    public Cliente setDocumento(String documento) {
        this.documento = documento;
        return this;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public Cliente setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
        return this;
    }   
}
