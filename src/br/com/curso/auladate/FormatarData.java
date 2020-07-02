package br.com.curso.auladate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatarData {

    public static void main(String[] args) {

        Date agora = new Date();

        SimpleDateFormat formatando = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        String dataFormatada = formatando.format(agora);
        System.out.println(dataFormatada);

    }
}
