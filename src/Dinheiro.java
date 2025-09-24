import java.math.BigDecimal;
import java.util.Objects;

// Esta é uma classe imutável e um Objeto de Valor.
public final class Dinheiro { // 'final' na classe impede que ela seja herdada.

    // Atributos são 'final', então só podem ser atribuídos uma vez, no construtor.
    private final BigDecimal valor;
    private final Moeda moeda;

    public Dinheiro(BigDecimal valor, Moeda moeda) {
        // Validação para garantir que não criamos dinheiro com valor negativo.
        if (valor == null || valor.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("O valor não pode ser nulo ou negativo.");
        }
        this.valor = valor;
        this.moeda = moeda;
    }

    // Apenas getters, sem setters. Impossível alterar o estado depois de criado.
    public BigDecimal getValor() { return valor; }
    public Moeda getMoeda() { return moeda; }

    // Sobrescrevo 'equals' para comparar objetos Dinheiro por seus valores, não pela referência.
    // Duas instâncias de Dinheiro são iguais se o valor e a moeda forem iguais.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dinheiro dinheiro = (Dinheiro) o;
        return valor.equals(dinheiro.valor) && moeda == dinheiro.moeda;
    }

    // Se eu sobrescrevo 'equals', sou obrigado a sobrescrever 'hashCode' também.
    // Ele deve gerar o mesmo número para objetos que são considerados 'equals'.
    @Override
    public int hashCode() {
        return Objects.hash(valor, moeda);
    }

    @Override
    public String toString() {
        // Apenas para facilitar a impressão do objeto.
        return moeda + " " + valor;
    }
}