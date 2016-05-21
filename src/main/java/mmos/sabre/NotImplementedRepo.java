package mmos.sabre;

import org.springframework.stereotype.Component;

@Component("unimplementedRepo")
public class NotImplementedRepo implements Repo {
    @Override
    public Passenger get(String id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void store(Passenger passenger) {
        throw new UnsupportedOperationException();
    }
}
