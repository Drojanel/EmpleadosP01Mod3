/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
/**
 *
 * @author ale_d
 */
@RunWith(Suite.class)
@SuiteClasses({
    TestAgregar.class, TestBuscar.class, TestEliminar.class, TestModificar.class,TestMontoBono.class
})
public class TestAll {
    
}
