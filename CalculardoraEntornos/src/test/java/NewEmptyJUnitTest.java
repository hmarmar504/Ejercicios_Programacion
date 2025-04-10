/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.calculardoraentornos.Calc;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author usuario
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    @Test
    public void testSuma(){
        assertEquals(9,Calc.suma(5,4));
    }
    
    @Test
    public void testResta(){
        assertEquals(1,Calc.resta(5,4));
    }
    
    @Test
    public void testMul(){
        assertEquals(6,Calc.mul(2,3));
    }
    
    @Test
    public void testDiv(){
        assertEquals(3,Calc.div(6,2));
    }
    
    
}
