package Q07;

import java.util.*;

public class InMemoryRepository<T extends Identificavel<ID>, ID> implements IRepository<T, ID> {
    private final Map<ID, T> map = new HashMap<>();

    @Override
    public void salvar(T entidade) {
        map.put(entidade.getId(), entidade);
    }

    @Override
    public Optional<T> buscarPorId(ID id) {
        return Optional.ofNullable(map.get(id));
    }

    @Override
    public List<T> listarTodos() {
        return Collections.unmodifiableList(new ArrayList<>(map.values()));
    }

    @Override
    public void remover(ID id) throws EntidadeNaoEncontradaException {
        if (!map.containsKey(id)) {
            throw new EntidadeNaoEncontradaException("ID " + id + " não encontrado!");
        }
        map.remove(id);
    }
}
