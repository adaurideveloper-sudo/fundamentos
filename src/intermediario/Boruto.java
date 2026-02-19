package intermediario;

import static intermediario.Main.AldeiaPadrao;

public class Boruto extends Uzumaki implements HyugaUzumaki{


    public Boruto() {
        super("Naruto Uzumaki", AldeiaPadrao, 17, 10, NivelNinja.GENIN, Biju.KURAMA);
    }

    public void AtivarOKarma() {
        System.out.println("O karma foi ativado! Eu sou HyugaUzumaki Boruto!");
    }


    public void AtivarJougan() {
        System.out.println("O Jougan foi ativado! Eu sou HyugaUzumaki Boruto!");
    }
}
