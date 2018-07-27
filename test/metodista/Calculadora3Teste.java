
package metodista;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anderson Rafael
 */
public class Calculadora3Teste {
    
    @Test
    public void testarSoma(){
        Calculadora3 calc3 = new Calculadora3();
        assertEquals(calc3.somar(1,1), 2);
        assertEquals(calc3.somar(1,0), 1);
        assertEquals(calc3.somar(1,-1), 0);
     }  
   
    @Test
    public void testarSubtracao(){
        Calculadora3 calc3 = new Calculadora3();
        assertTrue(calc3.subtrair(1,1)==0);
        assertTrue(calc3.subtrair(1,-1)==2);
        assertTrue(calc3.subtrair(-1,1)==-2);
    }
    
    @Test(expected=ArithmeticException.class) //inseri essa Excessao Aritmetica para casos de divisao por zero
    public void testarDivisao(){
        Calculadora3 calc3 = new Calculadora3();
        assertEquals(calc3.dividir(3,2),1);
        assertFalse (calc3.dividir(3, 3) == 3);
        assertTrue (calc3.dividir(3,3)==1);
        assertTrue (calc3.dividir(3, 0)==0);
    }
    @Test
    public void testarMultiplicacao(){
        Calculadora3 calc3 = new Calculadora3();
       assertEquals(calc3.multiplicar(3,2),6);
       assertTrue (calc3.multiplicar(3,3)==9);
   
    }
    
    @Test
    public void testarModulo(){
        Calculadora3 calc3 = new Calculadora3();
        assertEquals(calc3.modular(8,3),2);
    }
    }
    

