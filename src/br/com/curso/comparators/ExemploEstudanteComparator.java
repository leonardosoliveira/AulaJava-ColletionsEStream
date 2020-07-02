package br.com.curso.comparators;

import java.util.Comparator;

public class ExemploEstudanteComparator implements Comparator<Estudante> {

    @Override
    public int compare(Estudante o1, Estudante o2) {
        return o2.getIdade() - o1.getIdade();
    }
}
