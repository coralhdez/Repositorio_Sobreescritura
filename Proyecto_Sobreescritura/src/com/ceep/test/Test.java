package com.ceep.test;

import com.ceep.dominio.Empleado;
import com.ceep.dominio.Escritor;
import com.ceep.dominio.Gerente;
import com.ceep.dominio.*;

public class Test {

    //POLIMORFISMO
//    public static void imprimir(Object obj) {
//        System.out.println(obj);
//    }
    
    //POLIMORFISMO
    public static void imprimir(Empleado obj){
        System.out.println(obj.mostrarDetalles());
    }
    
    public static void determinarTipo(Empleado obj){
    
        if(obj instanceof Gerente){
            System.out.println("Empleado es de tipo Gerente");
            System.out.println(((Gerente) obj).getDepartamento());  //downcasting
            //bajo el empleado a nivel del gerente
        }
        else if(obj instanceof Empleado){
            System.out.println("Empleado es de tipo Empleado");
        }
        else if(obj instanceof Object){
            System.out.println("Empleado es de tipo Object");
        }
    }

    public static void main(String[] args) {
        Empleado e1 = new Empleado(2100, "Pepe");
        Empleado e2 = new Escritor(com.ceep.dominio.TipoEscritura.CLASICO, 55000, "Cervantes");
        System.out.println(e1.mostrarDetalles());

        Gerente g1 = new Gerente("Contabilidad", 35000, "Pepe");
        System.out.println(g1.mostrarDetalles());

//        imprimir(e1.mostrarDetalles());
//        imprimir(g1.mostrarDetalles());

//          imprimir(e1);
//          imprimir(g1);
          
          determinarTipo(g1);
          System.out.println(e2.mostrarDetalles());
          System.out.println(((Escritor) e2).getTipoEscritura().getDescripcion());
        
          Escritor es1 = (Escritor) e2; //DOWNCASTING
          es1.getTipoEscritura(); 
          
          Empleado e3 = es1;
          

    }

}
