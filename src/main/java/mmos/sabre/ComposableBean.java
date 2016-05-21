package mmos.sabre;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * Project: ftp
 * Created by mmos on 21.05.16.
 *
 * @author Marcin Moskal
 * @version git
 */

@Component
public class ComposableBean implements InitializingBean, DisposableBean {
    @Autowired
    private CounterBean counterBean;

    @Autowired
    private PrototypeBean prototypeBean;

    @Override
    public String toString() {
        return super.toString() + "counter: " + counterBean.get();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(counterBean, "CounterBean must not be null!");
        System.err.println("Initializing ComposableBean");
    }

    @Override
    public void destroy() throws Exception {
        System.err.println("Shutting down ComposableBean!");
    }

    public String getPrototypeInfo() {
        return prototypeBean.toString();
    }
}
