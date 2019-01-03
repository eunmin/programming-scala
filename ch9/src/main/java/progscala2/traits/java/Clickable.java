package progscala2.traits.java;

public interface Clickable {
    default void click() {
        updateUI();
    }
    void updateUI();
}
