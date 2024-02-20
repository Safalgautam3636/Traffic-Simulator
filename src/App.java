import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Dynamic.Car;
import Dynamic.Truck;
import Dynamic.Vehicle;
import GUI.*;

public class App {
    public static void main(String[] args) throws Exception {
        Car car = new Car();
        Truck truck1 = new Truck(4); 
        Truck truck2 = new Truck(8); 
        List<Vehicle> vehicles = new LinkedList<Vehicle>();
        vehicles.add(car);
        vehicles.add(truck1);
        vehicles.add(truck2);

        System.out.println("Enter I for Imperal or M for Metric : ");
        Gui gui=null;
        Scanner sc=new Scanner(System.in);
        String ip=sc.next();
        System.out.println("Enter speed limit : ");
        double speed=sc.nextDouble();

        if(ip.equals("M")){
            gui = new MetricGui();
        }else if(ip.equals("I")){
            gui = new ImperialGui();
        }
        else{
            System.out.println("Try a valid choice!");
        }
        
        

        for (int i = 0; i < 11; i++)
        {
            for (Vehicle v : vehicles) {
                gui.setSpeedLimit(v, speed);
                v.update(1);
                String s = v.getClass().toString();
                System.out.printf("%s speed: %.2f mph", s, gui.getSpeed(v));
                System.out.println();

            }
        }
        sc.close();

    }
}
