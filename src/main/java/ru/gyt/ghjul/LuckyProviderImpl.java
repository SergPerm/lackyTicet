package ru.gyt.ghjul;

public class LuckyProviderImpl implements LuckyProvider {
    public Lucky get(long n) {
        return new Ticket(n);
    }
}
