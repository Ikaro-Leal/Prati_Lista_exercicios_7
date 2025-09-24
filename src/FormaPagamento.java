import java.math.BigDecimal;

// A palavra 'abstract' indica que esta classe é um modelo e não pode ser instanciada.
public abstract class FormaPagamento {

    // Este método é ABSTRATO.
    // Eu não digo COMO validar, apenas que toda forma de pagamento
    // que herdar desta classe SERÁ OBRIGADA a ter um método de validação.
    public abstract void validarPagamento() throws PagamentoInvalidoException;

    // Este método é CONCRETO. Ele tem uma implementação padrão.
    // Todas as classes filhas vão herdar este método exatamente como está.
    // Ele define o "template" de como um pagamento deve funcionar.
    public final void processarPagamento(BigDecimal valor) {
        try {
            // 1º Passo do template: validar.
            validarPagamento();

            // 2º Passo do template: se a validação passou, processar.
            System.out.println("Pagamento de R$" + valor + " processado com sucesso via " + this.getClass().getSimpleName() + ".");

        } catch (PagamentoInvalidoException e) {
            System.out.println("FALHA no pagamento: " + e.getMessage());
        }
    }
}