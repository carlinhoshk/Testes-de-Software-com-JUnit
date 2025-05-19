import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NumeroUtilTest {

    @Test
    public void testEhParComNumeroPar() {
        assertEquals(true, NumeroUtil.ehPar(2));
        assertEquals(true, NumeroUtil.ehPar(0));
        assertEquals(true, NumeroUtil.ehPar(-4));
    }

    @Test
    public void testEhParComNumeroImpar() {
        assertEquals(false, NumeroUtil.ehPar(3));
        assertEquals(false, NumeroUtil.ehPar(-1));
        assertEquals(false, NumeroUtil.ehPar(7));
    }

    @Test
    public void testEhPrimoComNumerosPrimos() {
        assertEquals(true, NumeroUtil.ehPrimo(2));
        assertEquals(true, NumeroUtil.ehPrimo(3));
        assertEquals(true, NumeroUtil.ehPrimo(5));
        assertEquals(true, NumeroUtil.ehPrimo(13));
        assertEquals(true, NumeroUtil.ehPrimo(17));
    }

    @Test
    public void testEhPrimoComNumerosNaoPrimos() {
        assertEquals(false, NumeroUtil.ehPrimo(1));
        assertEquals(false, NumeroUtil.ehPrimo(0));
        assertEquals(false, NumeroUtil.ehPrimo(-3));
        assertEquals(false, NumeroUtil.ehPrimo(4));
    }
}
