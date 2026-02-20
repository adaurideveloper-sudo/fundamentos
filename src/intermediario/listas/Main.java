package intermediario.listas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void main(String[] args) {

        List<String> ninjaList = new ArrayList<>();
        ninjaList.add("Naruto Uzumaki");
        ninjaList.add("Sasuke Uchiha");
        ninjaList.add("Itachi Uchiha");
        ninjaList.add("Tobirama Senju");
        ninjaList.add("Kakashi Hatake");
        ninjaList.set(3, "Hashirama Senju");
        ninjaList.remove(4);
        System.out.println(ninjaList);

        for (int i = 0; i < ninjaList.toArray().length; i++) {
            System.out.println(ninjaList.get(i));
        }

        System.out.println("Tamanho Lista = " + ninjaList.size() + " elementos.");

    }

}
