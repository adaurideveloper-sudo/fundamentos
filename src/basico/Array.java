package basico;

import static java.lang.System.out;


public class Array {

    public static void main(String[] args) {

        String [] ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Kakashi Hatake";
        ninja[4] = "Shikamaru Nara";
        ninja[5] = "Hinata Hyuuga";

        for (int i = 0; i < 6; i++) {
            out.println(ninja[i]);
        }

    }

}
