import java.math.BigDecimal;

public class Pac implements CalculadoraFrete {
    @Override
    public BigDecimal calcular(Pedido pedido) {
        System.out.println("Calculando frete com a estratégia PAC.");
        if (pedido.getCepDestino() == null || !pedido.getCepDestino().matches("[0-9]{8}")) {
            throw new CepInvalidoException("CEP inválido para cálculo.");
        }
        // Minha regra de negócio para PAC: 5% do valor do pedido.
        return pedido.getValor().multiply(new BigDecimal("0.05"));
    }
}