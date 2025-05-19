import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class ValidadorSenhaTest {
    private ValidadorSenha validador;

    @Before
    public void setUp() {
        validador = new ValidadorSenha();
    }

    @Test
    public void testSenhaValida() {
        assertTrue(validador.validar("Senha123"));
        assertTrue(validador.validar("Abcdef1g"));
    }

    @Test
    public void testSenhaCurta() {
        assertFalse(validador.validar("Abc12"));
    }

    @Test
    public void testSemMaiuscula() {
        assertFalse(validador.validar("senha1234"));
    }

    @Test
    public void testSemMinuscula() {
        assertFalse(validador.validar("SENHA1234"));
    }

    @Test
    public void testSemDigito() {
        assertFalse(validador.validar("Senhaaaaa"));
    }

    @Test
    public void testSenhaNula() {
        assertFalse(validador.validar(null));
    }
}
