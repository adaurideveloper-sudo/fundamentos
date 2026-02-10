package intermediario;

public class Main{

    private static final String Aldeia_Padrao = "Aldeia da Folha";

    public static void main() {

        //Criar ninja Naruto
        Ninja ninjaNaruto = new Ninja();
        ninjaNaruto.nome = "Naruto Uzumaki";
        ninjaNaruto.aldeia = Aldeia_Padrao;
        ninjaNaruto.idade = 17;

        //Criar ninja Sasuke
        Ninja ninjaSasuke = new  Ninja();
        ninjaSasuke.nome = "Sasuke Uchiha";
        ninjaSasuke.aldeia = Aldeia_Padrao;
        ninjaSasuke.idade = 19;

        int quantoTempoFalta = ninjaSasuke.anosParaSerHokage(50);
        System.out.println(quantoTempoFalta);

        //Criar ninja Sakura
        Ninja ninjaSakura = new Ninja();
        ninjaSakura.nome ="Sakura Haruno";
        ninjaSakura.aldeia = Aldeia_Padrao;
        ninjaSakura.idade = 18;


    }
}