


public class CartaoCredito extends FormaPagamento {
    private String numeroCartao;
    private String nomeTitular;

    public CartaoCredito(String numeroCartao, String nomeTitular) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
    }

    @Override
    public void validarPagamento() throws PagamentoInvalidoException {
        // Minha lógica de validação específica para cartão de crédito.
        System.out.println("Validando cartão de crédito...");
        if (numeroCartao == null || numeroCartao.replaceAll(" ", "").length() != 16) {
            throw new PagamentoInvalidoException("Número do cartão de crédito é inválido.");
        }
        if (nomeTitular == null || nomeTitular.trim().isEmpty()) {
            throw new PagamentoInvalidoException("Nome do titular é obrigatório.");
        }
        System.out.println("Cartão de crédito validado!");
    }
}