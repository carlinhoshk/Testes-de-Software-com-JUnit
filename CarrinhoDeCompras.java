import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
    private Map<String, Double> produtos = new HashMap<>();

    public void adicionarProduto(String nome, double preco) {
        produtos.put(nome, preco);
    }

    public void removerProduto(String nome) {
        produtos.remove(nome);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (double preco : produtos.values()) {
            total += preco;
        }
        return total;
    }
}