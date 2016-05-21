package mmos.sabre;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("unimplementedRepo")
@Lazy
public class NotImplementedRepo implements Repo {
    public NotImplementedRepo() {
        System.err.println("NotImplementedRepo constructor!");
    }

    @Override
    public Passenger get(String id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void store(Passenger passenger) {
        throw new UnsupportedOperationException();
    }
}
