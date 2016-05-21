package mmos.sabre;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class PassengerFactoryBean implements FactoryBean<Passenger> {
    @Override
    public Passenger getObject() throws Exception {
        return new Passenger("one", "Guy");
    }

    @Override
    public Class<?> getObjectType() {
        return Passenger.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
