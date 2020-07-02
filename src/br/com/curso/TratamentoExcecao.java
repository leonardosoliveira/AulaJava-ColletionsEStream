package br.com.curso;

import java.io.FileNotFoundException;

public class TratamentoExcecao {

    public static void main(String[] args) throws Exception {

        System.out.println("Ola ");

        try {
            new java.io.FileInputStream("arquivo.txt");
        } catch (FileNotFoundException e) {
            throw new Exception();
        }
    }
}
