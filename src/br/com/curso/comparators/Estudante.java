package br.com.curso.comparators;

public class Estudante implements Comparable<Estudante>{

    private final String nome;
    private final Integer idade;

    public Estudante(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    //Comparable nos permite ordenar o objeto que a gente está olhando, o nosso objeto de negocio, a nossa classe
    @Override
    public int compareTo(Estudante o) {
        return this.getIdade() - o.getIdade();
    }
}
