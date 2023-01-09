package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("D:\\arxivRjd.txt");
        if (file.createNewFile()) {
            System.out.println("Файл создан");
        } else {
            System.out.println("Файл уже существует");
        }

        FileReader fr = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fr);
        String Line = bufferedReader.readLine();
        while (Line != null) {
            System.out.println(Line);
            Line = bufferedReader.readLine();
        }

        ArrayList ticketBase = new ArrayList();
//            SortedSet<WorkTicket> ticketBase = new TreeSet<>();
        String printYN;
        Scanner sc = new Scanner(System.in);

        while (true) {
            WorkTicket workTicket = new WorkTicket();
            InTicket inTicket = new InTicket();
            inTicket.inTicketData(sc, workTicket);
            ticketBase.add(workTicket);
//                Collections.sort(ticketBase, new SortedByFamily());
            Collections.sort(ticketBase, new SortedByTrainNumber());
            System.out.print("Хотите распечатать билет: Y / N : ");
            printYN = sc.next();
            if (printYN.equals("Y")) {
                sc.close();
                break;
            }
        }
        PrintTicket printTicket = new PrintTicket();
        printTicket.pTicket(ticketBase);
    }
}
