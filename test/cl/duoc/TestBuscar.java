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
public class TestBuscar {
       public TestBuscar() {
    }

    @Test
    public void TestBuscar() {
        System.out.println("Buscar");
        String rut = "11111111";
        Empleado emp = new Empleado("11111111", "Joaquina", 36, 3);
        BussEmpleado instance = new BussEmpleado();
        Empleado obtenido = instance.Buscar(rut);
        Assert.assertEquals(emp.getRut(), obtenido.getRut());
    }
}
