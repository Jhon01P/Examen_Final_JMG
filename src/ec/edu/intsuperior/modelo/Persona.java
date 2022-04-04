/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import java.util.Date;

/**
 *
 * @author JhonP
 */
public class Persona {
   private String cedula;
   private String apellido;
   private String nombre;
   private String genero;
   private String email;
   private String telefono;
   private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String cedula, String apellido, String nombre, String genero, String email, String telefono, Date fechaNacimiento) {
        this.cedula = cedula;
        this.apellido = apellido;
        this.nombre = nombre;
        this.genero = genero;
        this.email = email;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
   
   @Override 
   public String toString(){
      return getCedula()+" "+getNombre()+" "+getApellido();
   }
   
}
 
