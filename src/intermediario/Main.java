package intermediario;

public class Main{

    public static final String AldeiaPadrao = "Aldeia da Folha";

    public static void main() {

        //Criar ninja Naruto
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzimaki";
        Naruto.aldeia = AldeiaPadrao;
        Naruto.idade = 17;
        Naruto.ModoSabioAtivado();
        //Criar ninja Sasuke
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = AldeiaPadrao;
        Sasuke.idade = 19;
        Sasuke.SharinganAtivado();

        int quantoTempoFalta = Sasuke.anosParaSerHokage(50);
        System.out.println(quantoTempoFalta);

        //Criar ninja Sakura
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = AldeiaPadrao;
        Sakura.idade = 18;
        Sakura.AtivarCura();

        // Criar Hinata Hyuga
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = AldeiaPadrao;
        Hinata.idade = 16;
        Hinata.ByakuganAtivado();

        //Criar Boruto HyugaUzumaki
        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.aldeia = AldeiaPadrao;
        Boruto.AtivarOKarma();
        Boruto.AtivarJougan();

    }
}