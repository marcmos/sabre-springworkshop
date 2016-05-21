package mmos.sabre;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {
    private final UUID uuid;

    public PrototypeBean() {
        this.uuid = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return super.toString() + " " + uuid;
    }
}
