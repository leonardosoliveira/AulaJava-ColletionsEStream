package br.com.curso.collections;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {

        List<String> esportes = new Vector<>();
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tenis de mesa");
        esportes.add("Handebol");

        //Irá percorrer o vetor
        System.out.println(esportes);


        //Altera o valor do index 2 de Tenis de mesa para PingPong
        esportes.set(2,"PingPong");

        //remove o esporte na posição 3 do vetor
        esportes.remove(3);

        //remove o valor PingPong do vetor
        esportes.remove("PingPong");

        System.out.println("=======================================================================");

        //retorna o primeiro item do vetor
        System.out.println(esportes.get(0));


        System.out.println("=======================================================================");
        //Irá percorrer o vetor
        System.out.println("Segundo For");
        for (String model: esportes) {
            System.out.println(model);
        }

    }
}
