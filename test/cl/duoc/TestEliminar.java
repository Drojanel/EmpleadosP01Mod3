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
public class TestEliminar {

    public TestEliminar() {
    }

    @Test
    public void TestEliminar() {
        System.out.println("Eliminar");
        String codigo = "9999999";
        Empleado emp = new Empleado("9999999", "Ester", 42, 5);
        BussEmpleado instance = new BussEmpleado();
        instance.Crear(emp);
        boolean esperando = true;
        boolean obtenido = instance.Eliminar(codigo);
        Assert.assertEquals(esperando, obtenido);
    }
}
