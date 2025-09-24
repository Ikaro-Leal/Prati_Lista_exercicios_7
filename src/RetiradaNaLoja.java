import java.math.BigDecimal;

public class RetiradaNaLoja implements CalculadoraFrete {
    @Override
    public BigDecimal calcular(Pedido pedido) {
        System.out.println("Calculando frete com a estratégia Retirada na Loja.");
        // A regra é simples: o frete é zero.
        return BigDecimal.ZERO;
    }
}