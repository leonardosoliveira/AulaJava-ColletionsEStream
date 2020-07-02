package br.com.curso.collections;

import java.util.*;

public class ExemploList {

    public static void main(String[] args) {

        //Garante ordem de inserção, permite adição, atualização, leitura e remoção sem regras adicionais
        //Permite a ordenação através de comparators

        List<String> nomes = new ArrayList<>();

        nomes.add("Leonardo");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Alice");

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);

        nomes.set(1,"Larissa");

        System.out.println(nomes);

        nomes.remove(3);

        System.out.println(nomes);

        nomes.remove("Larissa");

        System.out.println(nomes);

        String nome = nomes.get(0);
        System.out.println(nome);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        boolean temMaria = nomes.contains("Maria");
        System.out.println(temMaria);

        boolean listaVazia = nomes.isEmpty();
        System.out.println(listaVazia);


        int posicao = nomes.indexOf("Juliana");
        System.out.println("Posição que a Juliana está : " + posicao);

        nomes.clear();
        listaVazia = nomes.isEmpty();
        System.out.println(listaVazia);


        nomes.add("Leonardo");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Alice");

        System.out.println("Utilizando ForEach");
        for (String pessoa: nomes) {
            System.out.println(pessoa);
        }

        System.out.println("utilizando Iterator");
        Iterator<String> iterator = nomes.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
