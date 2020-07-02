package br.com.curso.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamApi {


    public static void main(String[] args) {

        //Manipulação de coleções com o paradigma funcional de forma paralela
        //Imutavel - não altera a coleção origem, sempre cria uma nova coleção

        //principais funcionalidades
        //Mapping - retorna uma coleção com mesmo tamanho da origem com os elementos alterados
        //Filtering - retorna uma coleção igual  ou menor que a coleção origem, com os elementos intactos
        //ForEach - executa uma determinada lógica para ccada elemento, retornando nada.
        //Peek - Executa uma determinada lógica para cada elemento, retornando a propria coleção.
        //Couting - Retorna um inteiro que representa a contagem de elementos.
        //Grouping - Retorna uma coleção agrupada de acordo com a regra definida.

        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        //O metodo count da interface Stream retorna a quantidade objetos na lista
        System.out.println(estudantes.stream().count());

        System.out.println("Nome com maior numero de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        System.out.println("Nome com menor numero de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        System.out.println("Nomes que possuem a letra r: " + estudantes.stream().filter((estudante) -> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        System.out.println("Retorna uma nova coleção com a quantidade de letras: " + estudantes.stream().map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        System.out.println("Retorna os três primeiros elementos da lista: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        System.out.println("Retorna os elementos utilizando o Foreach :" );
        estudantes.forEach(System.out::println);

        System.out.println("Todos os elementos possuem a letra W no nome ? " + estudantes.stream().allMatch((elemento) -> elemento.contains("w")));

        System.out.println("Tem algum elemento com a letra 'W' no nome ?" + estudantes.stream().anyMatch((elemento) -> elemento.contains("W")));

        System.out.println("Não tem nenhum elemento com a letra 'W' no nome ?" + estudantes.stream().noneMatch((elemento) -> elemento.contains("W")));

        System.out.println("Retorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        System.out.println("Operações encadeadas: ");
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter((estudante) -> estudante.toLowerCase().contains("a"))
               // .collect(Collectors.toList()));
                //.collect(Collectors.joining(", ")));
                //.collect(Collectors.toSet()));
                .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1 ))));


        System.out.println("Aula " + estudantes.stream().collect(Collectors.groupingBy(estudante -> estudante.substring(0, 1))));


    }
}
