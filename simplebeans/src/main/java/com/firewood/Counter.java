package com.firewood;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private final AtomicInteger counter = new AtomicInteger();

    public int getCount() {
        return counter.getAndIncrement();
    }
}
