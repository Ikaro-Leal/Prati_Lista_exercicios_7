import java.math.BigDecimal;

// Desenvolvedor também herda de Funcionario.
public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, BigDecimal salario) {
        // Chamo o construtor da classe pai novamente.
        super(nome, salario);
    }

    // Sobrescrevo o método de bônus com a regra do desenvolvedor.
    @Override
    public BigDecimal calcularBonus() {
        // A regra para o desenvolvedor é 10% do salário.
        return this.salario.multiply(new BigDecimal("0.10"));
    }
}