package core.mate.academy.model;

public class Bulldozer extends Machine {
    private boolean frontBlade;

    public Bulldozer(boolean frontBlade) {
        this.frontBlade = frontBlade;
    }

    public Bulldozer() {
    }

    public void setFrontBlade(boolean frontBlade) {
        this.frontBlade = frontBlade;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
