package intermediario;

public class MainHokage {
    public static void main(String[] args) {

        Hokage Hashirama = new Hokage();
        Hashirama.idade = 45;

        Hokage Tobirama = new Hokage("Tobirama Senju");
        System.out.println(Tobirama.nome);

        Hokage Hiruzen = new Hokage(40);
        System.out.println(Hiruzen.idade);

        Hokage Minato = new Hokage("Minato Namikaze",32, true);
        System.out.println(Minato.nome + " " + Minato.idade + " " + Minato.vivoOuNao);

    }
}
