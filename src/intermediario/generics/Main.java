package intermediario.generics;

import java.util.ArrayList;
import java.util.List;
public class Main {

    static void main(String[] args) {

        EquipamentosNinja kunai = new EquipamentosNinja("Kunai de ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("pergaminho");

       BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
       bolsaGenerica.adicionarequipamento(kunai);
       bolsaGenerica.adicionarequipamento(shuriken);
       bolsaGenerica.adicionarequipamento(pergaminho);

        System.out.println(bolsaGenerica);
        for (int i = 0; i < bolsaGenerica.size(); i++) {
            System.out.println(bolsaGenerica.get(i));
        }

    }

}

