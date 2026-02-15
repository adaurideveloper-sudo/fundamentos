package intermediario;

public class Main{

    public static final String AldeiaPadrao = "Aldeia da Folha";

    public static void main() {

        // Obj Uzumaki
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", AldeiaPadrao, 17, 10, NivelNinja.GENIN);
        System.out.println("Meu nome é "+ naruto.nome + ", " + "sou da "+ naruto.aldeia + " " + "e tenho " + naruto.idade + " anos, " + "ja completei " + naruto.numeroDeMissoesConcluidas + " missoes e meu nivel de ninja é " + naruto.rank + ".");
        naruto.ModoSabioAtivado();
        naruto.estrategiaDeBatalhaNinja();

        // Obj1 Uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", AldeiaPadrao, 18, 20, NivelNinja.CHUUNIN);
        sasuke.SharinganAtivado();
        sasuke.habilidadeEspecial();


        //Obj2 Uchiha
        Uchiha itachi = new Uchiha("Itachi Uchiha", AldeiaPadrao,27, 100, NivelNinja.JOUNIN);
        itachi.habilidadeEspecial();


        //Obj3 Uchiha
        Uchiha madara = new Uchiha("Madara Uchiha", AldeiaPadrao, 45, 900, NivelNinja.KAGE);
        madara.SharinganAtivado();
        madara.inteligenciaDeCombate();
        madara.inteligenciaDeCombate(150);


        //Criar ninja Kakashi
        Hatake kakashi = new Hatake("Kakashi Hatake", AldeiaPadrao, 48, 1000, NivelNinja.KAGE);
        System.out.println(("Meu nome é "+ kakashi.nome + ", " + "sou da "+ kakashi.aldeia + " " + "e tenho " + kakashi.idade + " anos, " + "ja completei " + kakashi.numeroDeMissoesConcluidas + " missoes e meu nivel de ninja é " + kakashi.rank + "."));
        kakashi.boasVindas();
        kakashi.SharinganAtivado();
        kakashi.ninjaDeElite();

    }
}
