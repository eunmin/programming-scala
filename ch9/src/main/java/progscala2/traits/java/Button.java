package progscala2.traits.java;

public class Button extends Widget implements Clickable {
    private String label;

    public Button(String label) {
        this.label = label;
    }

    @Override
    public void updateUI() {

    }
}
