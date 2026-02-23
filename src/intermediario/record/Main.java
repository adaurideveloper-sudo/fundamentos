package intermediario.record;


public class Main {
    static void main(String[] args) {

        Ninja ninja = new Ninja("Naruto Uzumaki", "naruto@konoha.com", 999999999);
        System.out.println(ninja);
        ninja.cadastrarNinja("Sasuke Uchiha", "sasuke@konoha.com", 888888899);
        ninja.cadastrarNinja("Itachi Uchiha", "itachi@konoha.com", 77777777);
        ninja.cadastrarNinja("Kakashi Hatake", "kakashi@konoha.com", 66666666);
        ninja.cadastrarNinja("Tobirama Senju", "tobi@konoha.com", 55555555);
        ninja.cadastrarNinja("Hashirama Senju", "hashi@konoha.com", 444444444);
    }
}

