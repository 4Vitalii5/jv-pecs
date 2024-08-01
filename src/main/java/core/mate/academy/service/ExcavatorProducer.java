package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator();
        Excavator excavator2 = new Excavator();
        Excavator excavator3 = new Excavator();
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavator1);
        excavators.add(excavator2);
        excavators.add(excavator3);
        excavator1.setColor("WHITE");
        excavator1.setName("John Deere");
        excavator1.setDippingDepth(5);
        excavator2.setColor("PURPLE");
        excavator2.setName("Caterpillar");
        excavator2.setDippingDepth(10);
        excavator3.setColor("GREY");
        excavator3.setName("Volvo");
        excavator3.setDippingDepth(8);
        return excavators;
    }
}
