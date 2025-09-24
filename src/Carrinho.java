import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public final class Carrinho {
    // A lista de itens e o cupom também são 'final'.
    private final List<ItemCarrinho> itens;
    private final BigDecimal cupomDeDesconto;

    // Construtor privado. Só a própria classe Carrinho pode criar instâncias diretamente.
    private Carrinho(List<ItemCarrinho> itens, BigDecimal cupomDeDesconto) {
        // Faço uma cópia defensiva da lista para garantir que ela seja imutável.
        this.itens = List.copyOf(itens);
        this.cupomDeDesconto = cupomDeDesconto;
    }

    // Método estático para criar um carrinho inicial, vazio. É o ponto de entrada.
    public static Carrinho carrinhoVazio() {
        return new Carrinho(List.of(), BigDecimal.ZERO);
    }

    // --- OPERAÇÕES QUE RETORNAM UM NOVO CARRINHO ---

    // Adicionar um item não altera este carrinho, mas retorna um NOVO com o item adicionado.
    public Carrinho adicionarItem(Produto produto, int quantidade) {
        // Crio uma nova lista mutável baseada na minha lista imutável atual.
        List<ItemCarrinho> novosItens = new ArrayList<>(this.itens);
        novosItens.add(new ItemCarrinho(produto, quantidade));
        // Retorno uma nova instância de Carrinho com a lista atualizada.
        return new Carrinho(novosItens, this.cupomDeDesconto);
    }

    // Aplicar um cupom também retorna um NOVO carrinho com o desconto.
    public Carrinho aplicarCupom(BigDecimal porcentagem) {
        // Validação: limite de 30% para o cupom.
        if (porcentagem.compareTo(new BigDecimal("0.30")) > 0 || porcentagem.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Cupom de desconto deve ser entre 0 e 30%.");
        }
        return new Carrinho(this.itens, porcentagem);
    }

    // --- MÉTODOS DE CÁLCULO ---

    public Dinheiro calcularTotal() {
        BigDecimal total = BigDecimal.ZERO;
        // Calculo o subtotal somando o preço de cada item vezes a sua quantidade.
        for (ItemCarrinho item : this.itens) {
            BigDecimal precoItem = item.getProduto().getPreco().getValor();
            BigDecimal totalItem = precoItem.multiply(new BigDecimal(item.getQuantidade()));
            total = total.add(totalItem);
        }

        // Se houver um cupom, eu aplico o desconto.
        if (cupomDeDesconto.compareTo(BigDecimal.ZERO) > 0) {
            BigDecimal valorDesconto = total.multiply(cupomDeDesconto);
            total = total.subtract(valorDesconto);
        }

        // Arredondo o valor final para 2 casas decimais usando o arredondamento bancário.
        return new Dinheiro(total.setScale(2, RoundingMode.HALF_EVEN), Moeda.BRL);
    }

    // Apenas para facilitar a visualização
    @Override
    public String toString() {
        return "Carrinho com " + itens.size() + " tipo(s) de item(ns), total: " + calcularTotal();
    }
}