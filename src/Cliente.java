// Digo que Cliente implementa Identificavel e que seu ID será do tipo Long.
public class Cliente implements Identificavel<Long> {
    private final Long id;
    private final String nome;

    public Cliente(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Sou obrigado a implementar o método da interface.
    @Override
    public Long getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        // Apenas para facilitar a impressão.
        return "Cliente{id=" + id + ", nome='" + nome + "'}";
    }
}