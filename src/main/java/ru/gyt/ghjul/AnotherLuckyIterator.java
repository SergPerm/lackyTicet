package ru.gyt.ghjul;

import java.util.Iterator;

public class AnotherLuckyIterator implements Iterator<Lucky> {
    private static long MAX = 10000;
    private LuckyProvider provider  = new LuckyProviderImpl();
    private long current = 0;
    public boolean hasNext() {
        return current < MAX;
    }

    public Lucky next() {
        Lucky lucky = provider.get(current);
        current++;
        return lucky;
    }
}

