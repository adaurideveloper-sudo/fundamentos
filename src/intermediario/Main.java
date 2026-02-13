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
        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", AldeiaPadrao, 20);
        Sasuke.SharinganAtivado();
        Sasuke.habilidadeespecial();
        Sasuke.estrategiaDeBatalhaNinja();


        //Obj Uchiha
        Uchiha itachi = new Uchiha("Itachi Uchiha", AldeiaPadrao, 27);

        //Criar ninja Sakura
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = AldeiaPadrao;
        Sakura.idade = 18;
        Sakura.AtivarCura();
        Sakura.habilidadeespecial();

        // Criar Hinata Hyuga
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = AldeiaPadrao;
        Hinata.idade = 16;
        Hinata.ByakuganAtivado();
        Hinata.habilidadeespecial();

        //Criar Boruto HyugaUzumaki
        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.aldeia = AldeiaPadrao;
        Boruto.AtivarOKarma();
        Boruto.AtivarJougan();
        Boruto.habilidadeespecial();


    }
}
