package intermediario.generics;

public class Main {

    static void main(String[] args) {

        EquipamentosNinja kunai = new EquipamentosNinja("Kunai de ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("pergaminho");

       BolsaGenerica<Object> bolsaGenerica = new BolsaGenerica<>();
       bolsaGenerica.adicionarEquipamento(kunai);
       bolsaGenerica.adicionarEquipamento(shuriken);
       bolsaGenerica.adicionarEquipamento(pergaminho);
       bolsaGenerica.mostrarEquipamentos();

        System.out.println(bolsaGenerica);
        for (int i = 0; i < bolsaGenerica.size(); i++) {
            System.out.println(bolsaGenerica.get(i));
        }

    }

}

