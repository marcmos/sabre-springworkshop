package mmos.sabre;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextAwareMonitor implements ApplicationContextAware, InitializingBean {
    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public String[] getAllBeans() {
        return applicationContext.getBeanDefinitionNames();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // woah, does not hide lazy beans
        applicationContext.getBeansOfType(Repo.class).keySet().forEach(System.err::println);
    }
}
