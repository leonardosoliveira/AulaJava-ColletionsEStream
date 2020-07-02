package br.com.curso.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploComparatorsComList {

    public static void main(String[] args) {

        //java.util.Comparator - Interface para definir classe com regra de ordenação
        //usada para definir uma regra de negocio

        //java.util.Comparable - Interface para definir regra de ordenação em uma classe dominio

        //algoritmo de ordenação

        //Utilizado primariamente em java.util.List

        //Permite a ordenação de objetos complexos (Criados pelo usuario)


        //Comparable e Comparator são interfaces auxiliares da API Collections para que possamos trabalhar com ordenação de coleções por exemplo em List

        //Comparable recebe apenas um argumento, então assume que ela será implementada dentro de uma classe de dominio, e vai comparar a classe atual com a classe recebida por parametro
        //Comparator recebe dois argumentos e é feito a comparação entre elas.


        //Implementação


        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));


        System.out.println("--------Ordem de inserção--------");
        System.out.println(estudantes);

        //ordenação realizada através do sort e usandp Lambda
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());

        System.out.println("--------Ordenado pelo Sort e Lambda--------");
        System.out.println(estudantes);

        //ordenando do maior para o menos com sort e Lambda
        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());

        System.out.println("---------Ordenado do maior para o menor com Sort e Lambda---------");
        System.out.println(estudantes);

        //ordenando de forma natural com o Comparator
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));

        System.out.println("-----------Ordenação normal com o Comparator----------");
        System.out.println(estudantes);

        //Ordenando de forma reversa com o Comparator
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());

        System.out.println(">>>>>>>>>Ordenação reversa com Comparator<<<<<<<<<<<");
        System.out.println(estudantes);

        //Ordenação de forma natural com o Comparable, só foi possivel realizar está ordenação pois a classe Estudante implementa Comparable
        Collections.sort(estudantes);

        System.out.println("********Ordenação normal com a interface Comparable**********");
        System.out.println(estudantes);

        //Ordenação de forma reversa com Comparator implementado na classe ExemploEstudanteComparator
        Collections.sort(estudantes, new ExemploEstudanteComparator());

        System.out.println("Ordenação reversa com a interface Comparator");
        System.out.println(estudantes);









    }
}
