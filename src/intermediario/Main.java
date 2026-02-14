package intermediario;

public class Main{

    public static final String AldeiaPadrao = "Aldeia da Folha";

    public static void main() {

        //Criar ninja Naruto
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", AldeiaPadrao, 17);
        System.out.println("Meu nome é "+ naruto.nome + ", " + "sou da aldeia "+ naruto.aldeia + " " + "e tenho " + naruto.idade + " anos.");
        naruto.ModoSabioAtivado();
        naruto.estrategiaDeBatalhaNinja();

        //Criar ninja Sasuke
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", AldeiaPadrao, 20);

        //Obj Uchiha
        Uchiha itachi = new Uchiha("Itachi Uchiha", AldeiaPadrao, 27);
        System.out.println("Meu nome é "+ itachi.nome +", " + "sou da aldeia "+ itachi.aldeia + " " + "e tenho " + itachi.idade + " anos.");

        //Criar ninja Kakashi
        Hatake kakashi = new Hatake("Kakashi Hatake", AldeiaPadrao, 48);
        kakashi.boasVindas();
        kakashi.SharinganAtivado();
        kakashi.ninjaDeElite();

        //Criar ninja Sakura
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = AldeiaPadrao;
        Sakura.idade = 18;
        Sakura.AtivarCura();
        Sakura.habilidadeEspecial();

        // Criar Hinata Hyuga
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = AldeiaPadrao;
        Hinata.idade = 16;
        Hinata.ByakuganAtivado();
        Hinata.habilidadeEspecial();

        //Criar Boruto HyugaUzumaki
        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.aldeia = AldeiaPadrao;
        Boruto.AtivarOKarma();
        Boruto.AtivarJougan();
        Boruto.habilidadeEspecial();


    }
}
