package intermediario;

public class MainHokage {
    public static void main(String[] args) {

        Senju Tobirama = new Senju("Tobirama Senju");
        System.out.println(Tobirama.nome);

        Senju Hiruzen = new Senju(40);
        System.out.println(Hiruzen.idade);

        Senju Minato = new Senju("Minato Namikaze", 50, true, "Hokage", 5);
        System.out.println(Minato.nome + " " + Minato.idade + " " + Minato.vivoOuNao);

        Senju Hashimara = new Senju();
        Hashimara.nome = "Hashirama Senju";
        Hashimara.idade = 45;
        Hashimara.sabedoriaHokage();

    }
}
