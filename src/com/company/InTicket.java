package com.company;

import java.util.Scanner;

public class InTicket {

    public void inTicketData(Scanner sc, WorkTicket workTicket){

        System.out.println("=== Заполните данные по билету ===");

        //Заполняем данные билета
        System.out.print("Введите город отправления ==> "); workTicket.setTown1(sc.nextLine());
        System.out.print("Введите город назначения ==> "); workTicket.setTown2(sc.nextLine());
        System.out.println("");
        System.out.print("Введите Фамилию пассажира ==> "); workTicket.setFamily(sc.nextLine());
        System.out.print("Введите Имя пассажира ==> "); workTicket.setName(sc.nextLine());
        System.out.print("Введите Отчество пассажира ==> "); workTicket.setPatronymic(sc.nextLine());
        System.out.println("");
        System.out.print("Введите номер поезда ==> "); workTicket.setTrainNumber(sc.nextInt());
        System.out.print("Введите номер вагона ==> "); workTicket.setVagonNumber(sc.nextInt());
        System.out.print("Введите номер места ==> "); workTicket.setPlace(sc.nextInt());
        System.out.print("Введите стоимость билета ==> "); workTicket.setCoust(sc.nextInt());
        System.out.println("");
    }
}
