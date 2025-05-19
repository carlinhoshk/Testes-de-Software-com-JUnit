import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CarrinhoDeComprasTest {
    private CarrinhoDeCompras carrinho;

    @Before
    public void setUp() {
        carrinho = new CarrinhoDeCompras();
    }

    @Test
    public void testAdicionarProduto() {
        carrinho.adicionarProduto("Arroz", 10.0);
        assertEquals(10.0, carrinho.calcularTotal(), 0.0001);
    }

    @Test
    public void testAdicionarVariosProdutos() {
        carrinho.adicionarProduto("Arroz", 10.0);
        carrinho.adicionarProduto("Feijao", 8.5);
        carrinho.adicionarProduto("Macarrao", 5.0);
        assertEquals(23.5, carrinho.calcularTotal(), 0.0001);
    }

    @Test
    public void testRemoverProduto() {
        carrinho.adicionarProduto("Arroz", 10.0);
        carrinho.adicionarProduto("Feijao", 8.5);
        carrinho.removerProduto("Arroz");
        assertEquals(8.5, carrinho.calcularTotal(), 0.0001);
    }

    @Test
    public void testRemoverProdutoInexistente() {
        carrinho.adicionarProduto("Arroz", 10.0);
        carrinho.removerProduto("Feijao"); 
        assertEquals(10.0, carrinho.calcularTotal(), 0.0001);
    }

    @Test
    public void testCalcularTotalVazio() {
        assertEquals(0.0, carrinho.calcularTotal(), 0.0001);
    }
}
