package model.bean;

import java.io.Serializable;


public class BeanContacto implements Serializable{
    
    private String correo;
    private String asunto;
    private String nombre;
    private String apellido;
    private String celular;
    private String mensaje;

    public BeanContacto() {
    }

    public BeanContacto(String correo, String asunto, String nombre, String apellido, String celular, String mensaje) {
        this.correo = correo;
        this.asunto = asunto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.mensaje = mensaje;
    }
      
        
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
      
}
