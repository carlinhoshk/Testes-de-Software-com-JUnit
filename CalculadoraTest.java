import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(2.0, calc.dividir(10, 5), 0.0001);
        assertEquals(-2.5, calc.dividir(-5, 2), 0.0001);
        assertEquals(0.0, calc.dividir(0, 10), 0.0001);
        assertThrows(ArithmeticException.class, () -> {
            calc.dividir(10, 0);
        });
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicar(2, 3));
        assertEquals(0, calc.multiplicar(0, 5));
        assertEquals(-15, calc.multiplicar(-3, 5));
        assertEquals(9, calc.multiplicar(-3, -3));
    }

    @Test
    public void testSomar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.somar(2, 3));
        assertEquals(0, calc.somar(2, -2));
        assertEquals(-1, calc.somar(-2, 1));
        assertEquals(-5, calc.somar(-2, -3));
    }

    @Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        assertEquals(-1, calc.subtrair(2, 3));
        assertEquals(4, calc.subtrair(2, -2));
        assertEquals(-3, calc.subtrair(-2, 1));
        assertEquals(1, calc.subtrair(-2, -3));
    }
}
