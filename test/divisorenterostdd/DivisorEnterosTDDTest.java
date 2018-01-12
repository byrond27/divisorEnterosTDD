/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisorenterostdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sercop-Admin
 */
public class DivisorEnterosTDDTest {
    
    public DivisorEnterosTDDTest() {
    }

    @Test
    public void dividirNumeroParaElMismoNumero() {
        assertEquals(1, Dividir.division(4,4),1);
    }
    @Test
    public void dividirDosNumeros() {
        assertEquals(5, Dividir.division(20,4),1);
    }
    @Test
    public void dividirPorCero() {
        Dividir.division(4, 0);
      }
    
    @Test
    public void dividirDosNumerosNoEneros() {
        assertEquals(3, Dividir.division(20,6),1);
    }
}
