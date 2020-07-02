package br.com.curso.auladate;

import java.util.Calendar;

public class Calendario {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        System.out.println("Compra realizada dia " + calendar.getTime());

        calendar.add(Calendar.DATE, 10);


        if (Calendar.DAY_OF_WEEK == 1){
            calendar.add(Calendar.DATE, 1);
            System.out.println("A data de pagamento será : " + calendar.getTime());
        }else if(Calendar.DAY_OF_WEEK == 7) {
            calendar.add(Calendar.DATE, 2);
            System.out.println("A data de pagamento será : " + calendar.getTime());
        }else{
            System.out.println("A data de pagamento será : " + calendar.getTime());
        }



    }
}
