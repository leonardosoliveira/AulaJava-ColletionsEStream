package br.com.curso.java.util.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

    public static void main(String[] args) {

        //Diferente das classes List e Set, o MAP não extend de collections
        //java.util.Map

        //java.util.TreeMap

        //Entrada de chave e valor
        //Permite valores repetidos, mas não permite repetição de chave.
        //Permite adição, busca por chave ou valor, atualização, remoção e navegação.
        //Pode ser ordenado.

        //Implementação TreeMap

        TreeMap<String, String> treeCapitais = new TreeMap<>();

        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianopolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("BH", "Belo Horizonte");

        System.out.println(treeCapitais);

        //retorna a primeira chave no topo da arvore
        System.out.println(treeCapitais.firstKey());

        //retorna a ultima chave no topo da arvores
        System.out.println(treeCapitais.lastKey());

        //retorna a primeira chave abaixo da chave informada por parametro
        System.out.println(treeCapitais.lowerKey("SC"));

        //retorna a primeira chave acima da chave informada por parametro
        System.out.println(treeCapitais.higherKey("SC"));

        System.out.println(treeCapitais);

        //Retorna a chave e o valor do elemento no topo da arvore
        System.out.println(treeCapitais.firstEntry().getKey() + " - " + treeCapitais.firstEntry().getValue());

        //Retorna a chave e o valor do elemento no final da arvore
        System.out.println(treeCapitais.lastEntry().getKey() + " - " + treeCapitais.lastEntry().getValue());


        //retorna a primeira chave e o valor abaixo da chave informada por parametro
        System.out.println(treeCapitais.lowerEntry("SC").getKey() + " ---- " + treeCapitais.lowerEntry("SC").getValue() );


        //retorna a primeira chave e valor acima da chave informada por parametro
        System.out.println(treeCapitais.higherEntry("SC").getKey() + " ---- " + treeCapitais.higherEntry("SC").getValue());


        Map.Entry<String,String> firstEntry = treeCapitais.pollFirstEntry();
        Map.Entry<String,String> lastEntry = treeCapitais.pollLastEntry();

        System.out.println(firstEntry.getKey() + " Mostrando e removendo com poll " + firstEntry.getValue());
        System.out.println(lastEntry.getKey() + " Mostrando e removendo com poll " + lastEntry.getValue());

        System.out.println(treeCapitais);

        System.out.println("Percorendo o Mapa com o Iterator");
        Iterator<String> iterator = treeCapitais.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " Iterator " + treeCapitais.get(key));
        }

        System.out.println("Percorrendo o MAPA com ForEach");
        for (String capitais: treeCapitais.keySet()
             ) {
            System.out.println(capitais + " -- " + treeCapitais.get(capitais));
        }


        System.out.println("Percorrendo o Mapa com Foreach de outro modo");
        for (Map.Entry<String,String> capital: treeCapitais.entrySet()
             ) {
            System.out.println(capital.getKey() + " --- " + capital.getValue());
        }


    }
}
