package progscala2.traits.java;

public interface Observer<State> {
    void receiveUpdate(State state);
}
