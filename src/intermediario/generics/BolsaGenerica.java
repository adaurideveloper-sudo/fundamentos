package intermediario.generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {

    private List<T> equipamentos = new ArrayList<>();

    public void adicionarEquipamento(T equipamento) {
        equipamentos.add(equipamento);
    }

    public T get(int index) {
        return equipamentos.get(index);
    }

    public int size() {
        return equipamentos.size();
    }

    //mostrar lista de Equipamentos
     public void mostrarEquipamentos() {
        for (T equipamento : equipamentos) {
            System.out.println(equipamento);
        }
     }
    @Override
    public String toString() {
        return equipamentos.toString();
    }
}
