package intermediario.record;


public class Main {
    static void main(String[] args) {

        RecordNinja cadastro = new RecordNinja("Naruto Uzumaki", "naruto@konoha.com", 999999999);
        System.out.println(cadastro);
        cadastro.cadastrarNinja("Sasuke Uchiha", "sasuke@konoha.com", 888888899);
        cadastro.cadastrarNinja("Itachi Uchiha", "itachi@konoha.com", 77777777);
        cadastro.cadastrarNinja("Kakashi Hatake", "kakashi@konoha.com", 66666666);
        cadastro.cadastrarNinja("Tobirama Senju", "tobi@konoha.com", 55555555);
        cadastro.cadastrarNinja("Hashirama Senju", "hashi@konoha.com", 444444444);
    }
}

