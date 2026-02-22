package intermediario.record;

public class Main {
    static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto", "naruto@gmail.com", 99999999);
        System.out.println(cadastro);
        cadastro.cadastrarNinja("Sasuke", "sasuke@gmail.com", 888888899);
        cadastro.cadastrarNinja("Itachi", "itachi@gmail.com", 77777777);
    }
}

