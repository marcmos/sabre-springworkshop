package mmos.sabre;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class InMemoryRepo implements Repo {
    private final Map<String, Passenger> repo = new HashMap<>();

    @Override
    public Passenger get(String id) {
        return repo.get(id);
    }

    @Override
    public void store(Passenger passenger) {
        repo.put(passenger.getId(), passenger);
    }
}
