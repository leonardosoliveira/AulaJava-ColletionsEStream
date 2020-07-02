package br.com.curso.java.util.map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {

    public static void main(String[] args) {
        //Diferente das classes List e Set, o MAP não extend de collections
        //java.util.Map

        //java.util.HashTable

        //Entrada de chave e valor
        //Permite valores repetidos, mas não permite repetição de chave.
        //Permite adição, busca por chave ou valor, atualização, remoção e navegação.
        //Pode ser ordenado.


        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Leonardo", 24);
        estudantes.put("Ronald", 29);
        estudantes.put("Wagner", 27);
        estudantes.put("Denis", 29);
        estudantes.put("Augusto", 28);

        System.out.println(estudantes);

        estudantes.put("Augusto", 33);

        System.out.println(estudantes);

        estudantes.remove("Denis");
        System.out.println(estudantes);

        int idadeEstudando = estudantes.get("Leonardo");
        System.out.println(idadeEstudando);

        System.out.println(estudantes.size());

        for (Map.Entry<String, Integer> entry: estudantes.entrySet()
             ) {
            System.out.println(entry.getKey() + " ----- " + entry.getValue());
        }

        for (String key: estudantes.keySet()
             ) {
            System.out.println(key + " ------ " + estudantes.get(key));
        }


    }
}
