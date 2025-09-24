import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

// A implementação também precisa declarar os mesmos tipos genéricos.
public class InMemoryRepository<T extends Identificavel<ID>, ID> implements IRepository<T, ID> {

    // Uso um Map para guardar os dados. A chave é o ID, o valor é a entidade.
    private final Map<ID, T> dados = new HashMap<>();

    @Override
    public void salvar(T entidade) {
        // O método 'put' do Map insere ou atualiza o valor para a chave fornecida.
        dados.put(entidade.getId(), entidade);
    }

    @Override
    public Optional<T> buscarPorId(ID id) {
        // Optional.ofNullable cria um Optional que contém o valor se ele não for nulo,
        // ou um Optional vazio se o valor for nulo (caso a chave não exista no Map).
        return Optional.ofNullable(dados.get(id));
    }

    @Override
    public List<T> listarTodos() {
        // Retorno uma cópia imutável dos valores do meu Map.
        // Isso protege meus dados internos de modificações externas.
        return List.copyOf(dados.values());
    }

    @Override
    public void remover(ID id) throws EntidadeNaoEncontradaException {
        // Tento remover a entidade. Se o resultado for nulo, significa que a chave
        // não existia, então eu lanço a minha exceção customizada.
        if (dados.remove(id) == null) {
            throw new EntidadeNaoEncontradaException("Não foi encontrada entidade com o ID: " + id);
        }
    }
}