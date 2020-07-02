package br.com.curso.java.util.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {

        //Diferente das classes List e Set, o MAP não extend de collections
        //java.util.Map

        //java.util.HashMap

        //Entrada de chave e valor
        //Permite valores repetidos, mas não permite repetição de chave.
        //Permite adição, busca por chave ou valor, atualização, remoção e navegação.
        //Pode ser ordenado.

        //Implementação do HashMap

        Map<String, Integer> campeoesCopa = new HashMap<>();

        campeoesCopa.put("Brasil", 5);
        campeoesCopa.put("Alemanha", 4);
        campeoesCopa.put("Italia", 4);
        campeoesCopa.put("Uruguai", 2);
        campeoesCopa.put("Argentina", 2);
        campeoesCopa.put("França", 2);
        campeoesCopa.put("Inglaterra", 1);
        campeoesCopa.put("Espanha", 1);


        System.out.println(campeoesCopa);

        //caso desejar atualizar algum valor, basta informar a chave e o valor a ser alterado
        campeoesCopa.put("Brasil", 6);

        System.out.println(campeoesCopa);

        System.out.println("Tamanho atual do mapa " + campeoesCopa.size());

        //para saber o valor de alguma chave, basta usar o get e informar a chave, será retornado o valor que aquela chave possui
        System.out.println(campeoesCopa.get("Argentina"));

        //Informando a chave, ele retonar se possui ou não no mapa
        System.out.println(campeoesCopa.containsKey("Brasil"));

        //irá remover a Espanha dos campeoes
        campeoesCopa.remove("Espanha");

        System.out.println("Existe a Espanha no Mapa ? " + campeoesCopa.containsKey("Espanha"));

        System.out.println(campeoesCopa);
        System.out.println("Tamanho atual do mapa " + campeoesCopa.size());

        //retorna se existe ou não alguma seleção com 6 vitorias
        System.out.println(campeoesCopa.containsValue(6));

        //percorre o Mapa e imprime as chaves e valores
        for (Map.Entry<String, Integer> entry: campeoesCopa.entrySet()) {
            System.out.println(entry.getKey() + " ==== " + entry.getValue());
        }

        //Percorre o paga e imprime as chaves e registro
        for (String key: campeoesCopa.keySet()
             ) {
            System.out.println(key + " ---- " + campeoesCopa.get(key));
        }


    }
}
