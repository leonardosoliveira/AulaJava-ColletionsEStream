package br.com.curso.optionals;

import javax.swing.text.html.Option;
import java.util.Optional;

public class ExemploOptionals {

    public static void main(String[] args) {

        //Tratamento de valores que podem ser nulos
        //Possui dois estados = Presente e Vazio

        //Permite que vocẽ execute operações em valores que podem ser nulos sem preocupação com as famosas NullPointerExceptions

        Optional<String> optionalString = Optional.of("Valor presente");
        System.out.println("Valor oocional que está presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));


        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("Valor opcional que não está presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));


        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Valor opcional que não está presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));


        Optional<String> optionalNullErro = Optional.of(null);
        System.out.println("Valor opcional que lança erro NullPointerException");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro == não está presente"));



    }

}
