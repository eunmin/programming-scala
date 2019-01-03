package progscala2.traits.java;

public class VetableButtonCountObserver {

    static class ClickCountObserver implements Observer<Clickable> {
        int count = 0;

        @Override
        public void receiveUpdate(Clickable clickable) {
            count += 1;
        }
    }

    public static void main(String[] args) {
        ClickCountObserver bco1 = new ClickCountObserver();
        ClickCountObserver bco2 = new ClickCountObserver();

        System.out.println("bco1:" + bco1.count);
        System.out.println("bco2:" + bco2.count);
    }
}
