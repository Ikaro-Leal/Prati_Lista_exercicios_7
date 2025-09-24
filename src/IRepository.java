import java.util.List;
import java.util.Optional;

// Defino a interface como genérica com dois tipos:
// T: O tipo da entidade (ex: Cliente)
// ID: O tipo do ID da entidade (ex: Long)
// '<T extends Identificavel<ID>>' é uma restrição. Garante que qualquer tipo T
// que eu usar aqui DEVE implementar a interface Identificavel.
public interface IRepository<T extends Identificavel<ID>, ID> {

    void salvar(T entidade);

    // 'Optional<T>' é um container que pode ou não ter um valor.
    // É uma forma moderna e segura de evitar NullPointerException.
    // Em vez de retornar 'null' se não encontrar, eu retorno um Optional vazio.
    Optional<T> buscarPorId(ID id);

    List<T> listarTodos();

    void remover(ID id) throws EntidadeNaoEncontradaException;
}