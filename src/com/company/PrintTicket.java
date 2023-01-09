package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class PrintTicket {

    public void pTicket(ArrayList ticketNew) throws IOException {
        Iterator iterator = ticketNew.iterator();

        PrintStream prRjd = new PrintStream(new FileOutputStream("D:\\arxivRjd.txt", true), true);
        PrintWriter out = new PrintWriter(prRjd);

        for(Object e : ticketNew){
            WorkTicket workTicket = (WorkTicket) iterator.next();
            System.out.println("---------------------------------");
            System.out.println("* " + workTicket.getTown1() + " - " + workTicket.getTown2());
            System.out.println("* " + workTicket.getFamily() + " " + workTicket.getName() + " " + workTicket.getPatronymic());
            System.out.println("* " + "Номер поезда: " + workTicket.getTrainNumber() + " Вагон: " + workTicket.getVagonNumber() + " Место: " + workTicket.getPlace());
            System.out.println("* " + "Стоимость " + workTicket.getCoust() + " руб.**");
            System.out.println("**** ПРИЯТНОГО ПУТИ ****");
            System.out.println("---------------------------------");

            //Сохранение данных в файл
            out.print("--------------------------------- \n" +
                    "* " + workTicket.getTown1() + " - " + workTicket.getTown2() + "\n" +
                    "* " + workTicket.getFamily() + " " + workTicket.getName() + " " + workTicket.getPatronymic() + "\n" +
                    "* " + "Номер поезда: " + workTicket.getTrainNumber() + " Вагон: " + workTicket.getVagonNumber() + " Место: " + workTicket.getPlace() + "\n" +
                    "* " + "Стоимость " + workTicket.getCoust() + " руб.**" + "\n" +
                    "**** ПРИЯТНОГО ПУТИ ****" + "\n" +
                    "---------------------------------\n");
        }
        out.close();
    }
}
