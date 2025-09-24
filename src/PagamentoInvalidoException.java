
// Essa class herda o RuntimeException para criar uma exceção customizada.
// RuntimeException para não ser obrigado a declarar 'throws' em todo lugar.


public class PagamentoInvalidoException extends RuntimeException {
    public PagamentoInvalidoException(String mensagem) {
        // Chamo o construtor da classe pai para definir a mensagem de erro.
        super(mensagem);
    }
}