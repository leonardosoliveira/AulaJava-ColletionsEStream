package br.com.curso.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {

    //Implementação java.util.Linkedlist
    //garante ordem de inserção, a ordem que os elementos são inseridos é  a ordem de saida
    //Permite adição, leitura e remoção considerando a regra basica de uma fila, primeira que entra é a primeira que sai
    //Não permite mudança de ordenação

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");

        filaBanco.add("Anderson");

        System.out.println(filaBanco);


        String clienteAserAtendido = filaBanco.poll();
        System.out.println(clienteAserAtendido);

        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);

        System.out.println(filaBanco);

        //filaBanco.clear();

        //O comando element caso encontre a fila vazia retorna um erro NoSuchElementException diferente do comando peek que retorna Null caso a fila esteja vazia
        String primeiroClienteErro = filaBanco.element();
        System.out.println(primeiroClienteErro);


        System.out.println("Utilizando o Iterator para listar os nomes");
        Iterator<String> nomesNaFila = filaBanco.iterator();

        while(nomesNaFila.hasNext()){
            System.out.println(nomesNaFila.next());
        }

        System.out.println(filaBanco.size());

        //filaBanco.clear();

        System.out.println(filaBanco.isEmpty());

        filaBanco.add("Leonardo");
        filaBanco.add("Ronald");

        for (String pessoas: filaBanco
             ) {
            System.out.println(pessoas);

        }

    }


}
