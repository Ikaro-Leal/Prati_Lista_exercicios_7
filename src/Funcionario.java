import java.math.BigDecimal;
import java.math.RoundingMode;

public class Funcionario {
    // Defino como 'protected' para que as classes filhas (Gerente, Desenvolvedor)
    // possam acessar esses atributos diretamente se precisarem.
    protected String nome;
    protected BigDecimal salario;

    // Construtor para criar um funcionário.
    public Funcionario(String nome, BigDecimal salario) {
        this.nome = nome;
        // Validação: o salário não pode ser nulo ou negativo.
        if (salario == null || salario.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("O salário não pode ser negativo.");
        }
        this.salario = salario;
    }

    // Getters para que o mundo externo possa ler os dados.
    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    // Este é o método base para calcular o bônus.
    // Um funcionário genérico pode não ter bônus, então retorno zero.
    // As classes filhas vão sobrescrever isso com sua própria lógica.
    public BigDecimal calcularBonus() {
        return BigDecimal.ZERO;
    }
}