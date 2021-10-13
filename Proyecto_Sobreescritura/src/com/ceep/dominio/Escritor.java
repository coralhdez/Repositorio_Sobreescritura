
package com.ceep.dominio;


public class Escritor extends Empleado{
    final TipoEscritura tipoEscritura;

    public Escritor(TipoEscritura tipoEscritura, double sueldo, String nombre) {
        super(sueldo, nombre);
        this.tipoEscritura = tipoEscritura;
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }
    
    
    
    @Override
    public String mostrarDetalles(){
        return super.mostrarDetalles() + ", Escritor : " + this.tipoEscritura;
    }
}
