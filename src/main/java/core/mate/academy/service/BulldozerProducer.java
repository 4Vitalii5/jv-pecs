package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        Bulldozer bulldozer2 = new Bulldozer();
        Bulldozer bulldozer3 = new Bulldozer();
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer2);
        bulldozers.add(bulldozer3);
        bulldozer1.setColor("ORANGE");
        bulldozer1.setName("Crawlers");
        bulldozer1.setFrontBlade(true);
        bulldozer2.setColor("BLACK");
        bulldozer2.setName("Wheel bulldozer");
        bulldozer2.setFrontBlade(true);
        bulldozer3.setColor("GREY");
        bulldozer3.setName("John Deere 1050K");
        bulldozer3.setFrontBlade(false);
        return bulldozers;
    }
}
