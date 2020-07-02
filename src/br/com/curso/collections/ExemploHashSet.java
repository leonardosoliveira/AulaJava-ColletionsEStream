package br.com.curso.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args) {

        //Implementação de java.util.Set
        //Java.Util.HashSet

        //Por padrão, não garante ordenação por isso possui alta performance
        //Não permite itens repetidos
        //Permite adição e remoção normalmente. Não possui busca por item e atualização. Para leitura, apenas navegação.


        //===========================================
        //HashSet
        //Utilizado quando não é necessario manter uma ordenação
        //Não é ordenado e não permite valores repetidos
        //Por não ter repetição de valores e não ser ordenado, é a implementação mais performatica.


        //Implementação do HashSet

        Set<Double> notasAlunos = new HashSet<>();

        //adiciona as notas dos alunos
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);
        notasAlunos.add(4.0);

        System.out.println(notasAlunos);



        //removendo nota do Set
        notasAlunos.remove(3.8);

        System.out.println(notasAlunos);

        //Retorna a quantidade de itens no Set
         System.out.println(notasAlunos.size());

         //Percorre por todos os itens do Set com Iterator
        System.out.println("======================================================");
        System.out.println("Iterator");
        Iterator<Double> notas = notasAlunos.iterator();
        while (notas.hasNext()){
            System.out.println(notas.next());
        }

        //Percorre todos os itens do Set com o forEach
        System.out.println("======================================================");
        System.out.println("ForEach");
        for (Double n: notasAlunos
             ) {
            System.out.println(n);
        }

        notasAlunos.clear();

        System.out.println(notasAlunos.isEmpty());

    }
}
