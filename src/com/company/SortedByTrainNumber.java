package com.company;

import java.util.Comparator;

public class SortedByTrainNumber implements Comparator<WorkTicket> {

    @Override
    public int compare(WorkTicket o1, WorkTicket o2) {
        int trainNumber1 = o1.getTrainNumber();
        int trainNumber2 = o2.getTrainNumber();
        if(trainNumber1 > trainNumber2){
            return 1;
        } else if (trainNumber1 < trainNumber2) {
            return -1;
        } else {
            return 0;
        }
    }
}
