package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        Truck truck3 = new Truck();
        List<Truck> trucks = new ArrayList<>();
        trucks.add(truck1);
        trucks.add(truck2);
        trucks.add(truck3);
        truck1.setColor("RED");
        truck1.setName("Car transporters");
        truck1.setCurbWeight(5000);
        truck2.setColor("BLUE");
        truck2.setName("Cement truck");
        truck2.setCurbWeight(8000);
        truck3.setColor("YELLOW");
        truck3.setName("Box truck");
        truck3.setCurbWeight(2500);
        return trucks;
    }
}
