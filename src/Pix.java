public class Pix extends FormaPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void validarPagamento() throws PagamentoInvalidoException {
        // Minha lógica de validação específica para Pix.
        System.out.println("Validando chave Pix...");
        if (chavePix == null || chavePix.trim().isEmpty()) {
            throw new PagamentoInvalidoException("Chave Pix não pode ser vazia.");
        }
        System.out.println("Chave Pix validada!");
    }
}