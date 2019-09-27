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
public class TestModificar {
       public TestModificar() {
    }
    
    @Test
    public void TestModificar(){
       System.out.println("Modificar");
      Empleado emp = new Empleado("192774292", "Alejandro", 23, 3);
       BussEmpleado instance = new BussEmpleado();
       instance.Crear(emp);
       boolean esperando = true;
       emp = new Empleado("192774292", "Alejandro", 23, 5);
       boolean obtenido=instance.Modificar(emp);
       Assert.assertEquals(esperando, obtenido);
    }
}
