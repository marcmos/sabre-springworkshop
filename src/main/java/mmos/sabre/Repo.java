package mmos.sabre;

public interface Repo {
    Passenger get(String id);
    void store(Passenger passenger);
}
