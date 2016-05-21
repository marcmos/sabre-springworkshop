package mmos.sabre;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
public class CounterBean implements InitializingBean {
    @Value("${counter.initialValue}")
    private Long initialValue;

    private AtomicLong counts;

    public long get() {
        return counts.get();
    }

    public long incrementAndGet() {
        return counts.incrementAndGet();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        counts = new AtomicLong(initialValue);
    }
}
