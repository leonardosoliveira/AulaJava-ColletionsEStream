package br.com.curso.bytebank.model;

import java.time.LocalDate;

public class Supervisor extends Funcionario{


    public Supervisor(String nome, int matricula, LocalDate dataNascimento) {
        super(nome, matricula, dataNascimento);
    }

    @Override
    public double calcImposto(double valor) {
        return valor * 0.05;
    }
}
