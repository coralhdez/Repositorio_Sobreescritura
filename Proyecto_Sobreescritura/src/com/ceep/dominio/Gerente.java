/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.dominio;

/**
 *
 * @author Alumno Mañana
 */
public class Gerente extends Empleado{
    private String departamento;

    public Gerente(String Departamento, double sueldo, String nombre) {
        super(sueldo, nombre);
        this.departamento = Departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
    
    public String mostrarDetalles(){  
        
        return super.mostrarDetalles() + "Gerente: " + this.departamento;
        
    }

   
    
    
}
