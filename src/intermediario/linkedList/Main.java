package intermediario.linkedList;

import java.util.LinkedList;

public class Main {

    static void main(String[] args) {

        // Iniciar uma Linked lis com 7 ninjas
        LinkedList<Ninja>listaDeNinjas = new LinkedList<>();


        // Adicionar os ninjas na Linkedlist
        listaDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Sasuke Uchiha", 18, "Konoha"));
        listaDeNinjas.add(new Ninja("Itachi Uchiha", 27, "Konoha"));
        listaDeNinjas.add(new Ninja("Kakashi Hatake", 48, "Konoha"));
        listaDeNinjas.add(new Ninja("Tobirama Senju", 45, "Konoha"));
        listaDeNinjas.add(new Ninja("Hashirama Senju", 56, "Konoha"));
        listaDeNinjas.add(new Ninja("Yugao Uzuki", 52, "Konoha"));
        // Complexidade O(n)
        for (Ninja ninja : listaDeNinjas) {
            System.out.println(ninja);
        }
        // Listar todos os ninjas
        System.out.println("-------------------Lista de Ninjas------------------");
        System.out.println("===============add-first===============");
        //Adicionar o ninja no inicio da lista
        listaDeNinjas.addFirst(new Ninja("Boruto Hyoga",  14, "Konoha"));
        // Complexidade O(n)
        for (Ninja ninja : listaDeNinjas) {
            System.out.println(ninja);
        }
        System.out.println("====================remove=================");
        // remover o ninja no inicio da lista
        Ninja removido = listaDeNinjas.removeFirst();
        System.out.println("Ninja removido = " + removido);

        System.out.println("=====================index=================");
        // Procurar um ninja por indice
        Ninja terceiroNinja = listaDeNinjas.get(2);
        System.out.println("Terceiro Ninja = " + terceiroNinja);

    }


}
