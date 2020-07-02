package br.com.curso.bytebank.model;

import java.time.LocalDate;

public class Atendente extends Funcionario{
    public Atendente(String nome, int matricula, LocalDate dataNascimento) {
        super(nome, matricula, dataNascimento);
    }

    @Override
    public double calcImposto(double valor) {
        return valor * 0.01;
    }
}
