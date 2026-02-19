package intermediario;

public class Main{

    public static final String AldeiaPadrao = "Aldeia da Folha";

    static void main() {


        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", AldeiaPadrao, 17, 10, NivelNinja.GENIN, Biju.KURAMA);
        System.out.println("Meu nome é "+ naruto.getNome() + ", " + "sou da "+ naruto.getAldeia() + " " + "e tenho " + naruto.getIdade() + " anos, " + "ja completei " + naruto.getNumeroDeMissoesConcluidas() + " missoes e meu nivel de ninja é " + naruto.getRank()+ ".");
        naruto.ModoSabioAtivado();
        naruto.estrategiaDeBatalhaNinja();

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", AldeiaPadrao, 18, 20, NivelNinja.CHUUNIN);
        sasuke.SharinganAtivado();
        sasuke.habilidadeEspecial();

        Uchiha itachi = new Uchiha("Itachi Uchiha", AldeiaPadrao,27, 100, NivelNinja.JOUNIN);
        itachi.habilidadeEspecial();

        Uchiha madara = new Uchiha("Madara Uchiha", AldeiaPadrao, 45, 900, NivelNinja.KAGE);
        madara.SharinganAtivado();
        madara.inteligenciaDeCombate();
        madara.inteligenciaDeCombate(150);

        Hatake kakashi = new Hatake("Kakashi Hatake", AldeiaPadrao, 48, 1000, NivelNinja.KAGE);
        System.out.println(("Meu nome é "+ kakashi.getNome() + ", " + "sou da "+ kakashi.getAldeia() + " " + "e tenho " + kakashi.getIdade() + " anos, " + "ja completei " + kakashi.getNumeroDeMissoesConcluidas() + " missoes e meu nivel de ninja é " + kakashi.getRank() + "."));
        kakashi.boasVindas();
        kakashi.SharinganAtivado();
        kakashi.ninjaDeElite();

        Uzumaki boruto = new Uzumaki("Boruto Hyoga Uzumaki", AldeiaPadrao, 14, 5, NivelNinja.GENIN);
        System.out.println(boruto);

        Anbu ninjaAnbu = new Anbu("Yugao Uzuki", AldeiaPadrao, 26, 200, NivelNinja.JOUNIN);
        ninjaAnbu.anbu();
        ninjaAnbu.setNome("Itachi Uchiha");
        ninjaAnbu.anbu();
        ninjaAnbu.setNome("Kakashi Hatake");
        ninjaAnbu.anbu();

    }

}


