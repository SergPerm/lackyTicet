package ru.gyt.ghjul;

import java.util.Arrays;

public class Ticket implements Lucky{
    private int[] ticket;

    public Ticket(long tick) {
        int j=5;
        int [] ticket1 = {0,0,0,0,0,0};

        while (j>=0){
            ticket1 [j] = (int) tick%10;
            tick= (long) tick/10;
            j=j-1;
        }

        this.ticket = ticket1;
    }

    public boolean isLucky() {
        int firstSum = ticket[0] + ticket[1] + ticket[2];
        int secondSum = ticket[3] + ticket[4] + ticket[5];
        return firstSum == secondSum;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticket=" + Arrays.toString(ticket) +
                '}';
    }
}
