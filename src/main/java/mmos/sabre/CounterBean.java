package mmos.sabre;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
public class CounterBean {
    private final AtomicLong counts = new AtomicLong();

    public long get() {
        return counts.get();
    }

    public long incrementAndGet() {
        return counts.incrementAndGet();
    }
}
