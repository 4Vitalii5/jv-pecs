package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private boolean frontBlade;

    public Bulldozer(boolean frontBlade) {
        this.frontBlade = frontBlade;
    }

    public Bulldozer() {
    }

    public boolean isFrontBlade() {
        return frontBlade;
    }

    public void setFrontBlade(boolean frontBlade) {
        this.frontBlade = frontBlade;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
