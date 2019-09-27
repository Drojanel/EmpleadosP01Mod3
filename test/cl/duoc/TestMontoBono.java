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
public class TestMontoBono {

    public TestMontoBono() {
    }
    
   @Test
    public void TestMontoBono() {
        System.out.println("BonoMonto");
        Empleado emp = new Empleado("11111111", "Joaquina", 36, 3);
        int esperado = 0;
        int obtenido = emp.MontoBono();
        Assert.assertEquals(esperado, obtenido);
    }
}