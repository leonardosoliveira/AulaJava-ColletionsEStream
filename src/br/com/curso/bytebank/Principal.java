package br.com.curso.bytebank;

import br.com.curso.bytebank.model.Atendente;
import br.com.curso.bytebank.model.Gerente;
import br.com.curso.bytebank.model.Supervisor;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {

        System.out.println("Olá mundo !!");

        Gerente edu = new Gerente("Eduardo Carnevale", 14029, LocalDate.of(1966,07,17));
        double imposto = edu.calcImposto(1000);
        System.out.println(edu + "calculo do imposto: " + imposto);

        Supervisor flavio = new Supervisor("Flavio Alves", 11134, LocalDate.of(1977,04,12));
        System.out.println(flavio + " Valor a pagar de imposto  " + flavio.calcImposto(1000));

        Atendente tati = new Atendente("Tatiane Oliveira", 23821, LocalDate.of(1990,05,10));
        System.out.println(tati + " Valor a pagar de imposto " + tati.calcImposto(1000));


    }
}
