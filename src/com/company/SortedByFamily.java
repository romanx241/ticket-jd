package com.company;

import java.util.Comparator;

public class SortedByFamily implements Comparator<WorkTicket> {

    @Override
    public int compare(WorkTicket o1, WorkTicket o2) {
        String family1 = o1.getFamily();
        String family2 = o2.getFamily();
        return family1.compareTo(family2);
    }

}
