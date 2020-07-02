package br.com.curso.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {

        //Implementação de java.util.Set
        //Java.Util.LinkedHashSet
        //LinkedHashSet
        //Utilizado quando é necessario manter a ordem de inserção dos elementos
        //Mantem a ordem de inserção dos elementos
        //É a implementação mais lenta por ser necessaria manter a ordem.

        //Implementação


        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();


        sequenciaNumerica.add(16);
        sequenciaNumerica.add(7);
        sequenciaNumerica.add(10);
        sequenciaNumerica.add(3);
        sequenciaNumerica.add(9);
        sequenciaNumerica.add(13);



        System.out.println(sequenciaNumerica);

        sequenciaNumerica.remove(10);

        System.out.println(sequenciaNumerica);

        System.out.println(sequenciaNumerica.size());

        System.out.println(sequenciaNumerica.isEmpty());

        Iterator<Integer> numeros = sequenciaNumerica.iterator();
        while (numeros.hasNext()){
            System.out.println("Iterator " + numeros.next());
        }

        for (Integer num: sequenciaNumerica
             ) {
            System.out.println("forEach " + num);
        }


    }
}
