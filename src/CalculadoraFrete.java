import java.math.BigDecimal;

// Esta anotação indica que a interface tem apenas um método abstrato.
// Isso a torna uma "Interface Funcional", que é o que nos permite


@FunctionalInterface
public interface CalculadoraFrete {
    BigDecimal calcular(Pedido pedido);
}