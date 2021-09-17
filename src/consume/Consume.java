package consume;

public interface Consume {
    public void consume();

    public void checkIfExpired();

    public void throwAway();
}
