package ru.gyt.ghjul;

/**
 * *
 * возвращает билеты {@link Lucky}
 */
public interface LuckyProvider {
    /**
     * @param n
     * @return
     */
    default Lucky get(long n) {
        return new Ticket(n);
    }
}
