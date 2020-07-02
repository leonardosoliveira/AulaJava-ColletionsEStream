package br.com.curso.auladate;

import org.w3c.dom.ls.LSOutput;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

public class Datas {

    public static void main(String[] args) {

        // Java.util.date

        //nesse modo ele pega a data atual que o programa for executado
        Date novaData = new Date();
        System.out.println(novaData);

        Long currentTimeMillis = System.currentTimeMillis();

        Date outraData = new Date(currentTimeMillis);

        System.out.println(currentTimeMillis);
        System.out.println(outraData);

        //classe mais atual a partir do Java 1.8
        Instant instant = novaData.toInstant();
        System.out.println(instant);


        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate ontem = LocalDate.now().minusDays(1);
        System.out.println(ontem);


    }



}
