package intermediario.generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {

    private List<T> equipamentos = new ArrayList<>();

    public void adicionarequipamento(T equipamento) {
        equipamentos.add(equipamento);
    }

    public T get(int index) {
        return equipamentos.get(index);
    }

    public int size() {
        return equipamentos.size();
    }

    @Override
    public String toString() {
        return equipamentos.toString();
    }
}
