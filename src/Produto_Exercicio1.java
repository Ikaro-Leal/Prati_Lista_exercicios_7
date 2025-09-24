

public class Produto_Exercicio1 {

    //--------------------------+  Questão 1  +--------------------------
    // Defino os atributos como 'private'.
    // Isso significa que só consigo acessá-los diretamente de dentro desta classe.
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Este é o construtor. Uso ele para criar um novo produto já com valores iniciais.
    // Chamo meus próprios setters aqui dentro para já aproveitar as validações desde o início.
    public Produto_Exercicio1(String nome, double preco, int quantidadeEmEstoque) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidadeEmEstoque(quantidadeEmEstoque);
    }

    // --- GETTERS (Métodos para ler os valores dos atributos) ---

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidadeEmEstoque() {
        return this.quantidadeEmEstoque;
    }

    // --- SETTERS (Métodos para alterar os valores, com validações) ---

    public void setNome(String nome) {
        // Preciso garantir que o nome não seja nulo nem uma string vazia (após remover espaços).
        if (nome == null || nome.trim().isEmpty()) {
            // Se for inválido, eu lanço uma exceção. Isso interrompe o programa
            // e avisa que algo deu errado.
            throw new IllegalArgumentException("O nome do produto não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public void aplicarDesconto(double porcentagem) {
        // Validação: a porcentagem de desconto deve estar entre 0 e 50.
        if (porcentagem < 0 || porcentagem > 50) {
            // Se a regra for violada, lanço uma exceção para sinalizar o erro.
            throw new IllegalArgumentException("A porcentagem de desconto deve ser entre 0 e 50.");
        }

        // Calculo o valor do desconto.
        // Ex: se o preço é 100 e a porcentagem é 10, o desconto é (100 * 10) / 100 = 10.
        double valorDoDesconto = this.preco * (porcentagem / 100.0);

        // Subtraio o valor do desconto do preço atual do produto.
        this.preco -= valorDoDesconto;
    }


    public void setPreco(double preco) {
        // Validação: não posso aceitar um preço negativo.
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        this.preco = preco;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        // Validação: o estoque também não pode ser negativo.
        if (quantidadeEmEstoque < 0) {
            throw new IllegalArgumentException("A quantidade em estoque não pode ser negativa.");
        }
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }


//--------------------------+  Questão 2  +--------------------------


}