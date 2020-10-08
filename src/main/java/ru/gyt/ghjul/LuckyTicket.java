package ru.gyt.ghjul;

import javax.sql.rowset.Predicate;
import java.util.Arrays;

public class LuckyTicket {
    private static final int MAX_NUMBER = 999999;
    //    private static int count;

    public static int[] getTicket(long i){
        int j=5;
        int [] ticket = {0,0,0,0,0,0};

        while (j>=0){
            ticket [j] = (int) i%10;
            i= (int) i/10;
            j=j-1;
        }
        return ticket;
    }

    public static void main(String[] args) {
        long count = 0;
        LuckyIterator iterator = new LuckyIterator();
        Predicate <Lucky> = lucky -> lucky.isLucky;
        while (iterator.hasNext()){
            Lucky next = iterator.next();
            if (next.isLucky()){
                count++;
                System.out.println(next);
            }
        }
        System.out.println(count);
    }
}
