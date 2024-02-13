import java.util.LinkedList;
import java.util.List;

import Dynamic.Car;
import Dynamic.Truck;
import Dynamic.Vehicle;
import Shared.*;

public class App {
    public static void main(String[] args) throws Exception {
        Car car = new Car();
        car.setDesiredSpeed(65.0);
        Truck truck1 = new Truck(4); 
        truck1.setDesiredSpeed(55.0);
        Truck truck2 = new Truck(8); 
        truck2.setDesiredSpeed(50.0);
        List<Vehicle> vehicles = new LinkedList<Vehicle>();
        vehicles.add(car);
        vehicles.add(truck1);
        vehicles.add(truck2);
        
        ISimOutput op = new ImperialOutput();
        for (int i = 0; i < 11; i++)
        {
            for (Vehicle v : vehicles)
            {
                v.update(1);
                String s = v.getClass().toString();

                System.out.printf("%s speed: %.2f mph", s, op.getSpeed(v));
                System.out.println();

                
            }
        }

    }
}
