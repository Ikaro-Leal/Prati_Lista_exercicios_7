import java.math.BigDecimal;

// A palavra 'extends' faz com que Gerente herde tudo de Funcionario.
public class Gerente extends Funcionario {

    // O construtor do Gerente.
    public Gerente(String nome, BigDecimal salario) {
        // 'super(...)' é como eu chamo o construtor da classe pai (Funcionario)
        // para que ele cuide de atribuir o nome e o salário.
        super(nome, salario);
    }

    // A anotação '@Override' indica que estou propositalmente
    // substituindo o método que herdei da classe Funcionario.
    @Override
    public BigDecimal calcularBonus() {
        // A regra para o gerente é 20% do salário.
        // Uso o método 'multiply' do BigDecimal para fazer o cálculo.
        // Crio um BigDecimal a partir de uma String para garantir a precisão.
        return this.salario.multiply(new BigDecimal("0.20"));
    }
}