public class Boleto extends FormaPagamento {
    private String codigoBarras;

    public Boleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void validarPagamento() throws PagamentoInvalidoException {
        // Minha lógica de validação específica para boleto.
        System.out.println("Validando boleto...");
        if (codigoBarras == null || !codigoBarras.matches("[0-9]{47}")) {
            throw new PagamentoInvalidoException("Código de barras do boleto é inválido (deve ter 47 números).");
        }
        System.out.println("Boleto validado!");
    }
}