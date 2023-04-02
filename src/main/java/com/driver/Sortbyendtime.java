package com.driver;

import java.util.*;

public class Sortbyendtime implements Comparator<Meeting> {
    @Override
    public int compare(Meeting m1,Meeting m2){
        if(m1.getEndTime().compareTo(m2.getEndTime()) > 0) return 1;

        else return -1;
    }
}
