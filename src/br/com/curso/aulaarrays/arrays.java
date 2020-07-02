package br.com.curso.aulaarrays;

import java.util.ArrayList;

public class arrays {

    public static void main(String[] args) {
        //Um array serve para organizar valores em memoria, faz parte da biblioteca Java.util

        //Cada item em um array é chamado de elemento e cada posição é chamada de indice e começa com 0

        //Formas de declarar um array

        int[] numeros = new int[10];
        System.out.println(numeros.length);

        numeros[0]= 1;
        numeros[1]= 2;
        numeros[2]= 3;

        for (int i = 0; i < numeros.length;i++){
            System.out.println(numeros[i]);
        }

        //Formas de declarar e percorrer uma matriz

        int [][] matriz = { {1, 2, 3, 4}, {5, 6, 7, 8} };//declaração

        for (int i =0; i < matriz.length; i++){
            for (int j =0; j < matriz[i].length; j++){
                System.out.println(matriz[i][j]);
            }
        }












        //Utilizando um Array List
        ArrayList<String> list = new ArrayList();

        list.add("Coelho");
        list.add("Gato");
        list.add("Cachorro");
        list.add("Vaca");
        list.add("Elefante");

        for (String animal : list) {
            System.out.println(animal);
        }

        System.out.println(list);




    }
}
