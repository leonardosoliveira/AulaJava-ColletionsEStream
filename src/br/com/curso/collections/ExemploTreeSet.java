package br.com.curso.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {
        //Implementação de java.util.Set
        //Java.Util.TreeSet
        //TreeSet
        //Utilizado quando é necessario alterar a ordem através do uso de comparators
        //É performatico para leitura. Para modificação tem a necessidade de reordenar, sendo mais lento que o LinkedHashSet

        //Implementação TreeSet

        TreeSet<String> capitais = new TreeSet<>();
        capitais.add("Porto Alegre");
        capitais.add("Florianopolis");
        capitais.add("Curitiba");
        capitais.add("São Paulo");
        capitais.add("Belo Horizonte");

        System.out.println(capitais.size());
        System.out.println(capitais);

        //Retorna a primeira capital da lista no topo da arvore
        System.out.println(capitais.first());

        //Retorna a ultima capital no final da Arvore
        System.out.println(capitais.last());

        //retorna o primeiro elemento abaixo do enviado por parametro
        System.out.println(capitais.lower("Florianopolis"));

        //retorna o primeiro elemento acima do enviado por parametro
        System.out.println(capitais.higher("Florianopolis"));

        System.out.println(capitais);

        //retorna o primeiro elemento do Set e depois remove
        System.out.println(capitais.pollFirst());

        //retorna o ultimo elemento do Set e depois remove
        System.out.println(capitais.pollLast());


        Iterator<String> cap = capitais.iterator();
        while (cap.hasNext()){
            System.out.println("Iterator " + cap.next());
        }

        for (String c: capitais
             ) {
            System.out.println("ForEach " + c);

        }

        System.out.println(capitais.size());

    }
}
