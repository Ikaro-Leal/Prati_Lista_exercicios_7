

import java.math.BigDecimal;

public class Pedido {
    private final BigDecimal valor;
    private final String cepDestino;
    // O pedido TEM UMA estratégia de frete. Ele não sabe qual é,
    // apenas que ela existe e sabe como calcular.
    private CalculadoraFrete estrategiaDeFrete;

    public Pedido(BigDecimal valor, String cepDestino, CalculadoraFrete estrategiaInicial) {
        this.valor = valor;
        this.cepDestino = cepDestino;
        this.estrategiaDeFrete = estrategiaInicial;
    }

    // Método para trocar a estratégia em tempo de execução.
    public void setEstrategiaDeFrete(CalculadoraFrete novaEstrategia) {
        System.out.println("-> Trocando estratégia de frete...");
        this.estrategiaDeFrete = novaEstrategia;
    }

    // O pedido não calcula o frete diretamente. Ele DELEGA o cálculo
    // para o objeto de estratégia que ele possui no momento.
    public BigDecimal calcularFrete() {
        return this.estrategiaDeFrete.calcular(this);
    }

    // Getters para que as estratégias possam acessar os dados do pedido.
    public BigDecimal getValor() { return valor; }
    public String getCepDestino() { return cepDestino; }
}