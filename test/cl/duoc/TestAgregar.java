/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ale_d
 */
public class TestAgregar {
    
     public TestAgregar() {
    }
 
    
     @Test
    public void testAgregar(){
       System.out.println("Agregar");
       Empleado emp = new Empleado("192774292", "Alejandro", 23, 3);
       BussEmpleado instance = new BussEmpleado();
       boolean esperando = true;
       boolean obtenido=instance.Crear(emp);
       Assert.assertEquals(esperando, obtenido);
    }
}
