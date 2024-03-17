import Dynamic.Vehicle;
import GUI.*;
import RoadItems.Heading;
import RoadItems.IPrintDriver;
import RoadItems.Road;
import Shared.*;

public class App implements ISimInput,ISimOutput{
    public static void main(String[] args) throws Exception {
        System.out.println(Constants.AccRate);
            Gui simInput;
            Map map = new Map();
            IPrintDriver cp = new ConsolePrint();
            simInput = new MetricGui();
            Road Uptown = simInput.CreateRoad("Uptown", 0.0, -0.09, .180, Heading.North);
            map.AddRoad(Uptown);
            Road Crosstown = simInput.CreateRoad("Crosstown", -0.09, 0.0, .180, Heading.East);
            map.AddRoad(Crosstown);

            CharMatrix cm = new CharMatrix();
            map.Print(cp, cm);
            for (int i = 0; i < Constants.CharMapSize; i++)
            {
                String s = new String(cm.map[i]);
                System.out.println(s);
            }


        // Car car = new Car();
        // Truck truck1 = new Truck(4); 
        // Truck truck2 = new Truck(8); 
        // List<Vehicle> vehicles = new LinkedList<Vehicle>();
        // vehicles.add(car);
        // vehicles.add(truck1);
        // vehicles.add(truck2);

        // System.out.println("Enter I for Imperal or M for Metric : ");
        // Gui gui=null;
        // Scanner sc=new Scanner(System.in);
        // String ip=sc.next();
        // System.out.println("Enter speed limit : ");
        // double speed=sc.nextDouble();

        // if(ip.equals("M")){
        //     gui = new MetricGui();
        // }else if(ip.equals("I")){
        //     gui = new ImperialGui();
        // }
        // else{
        //     System.out.println("Try a valid choice!");
        // }
        
        

        // for (int i = 0; i < 11; i++)
        // {
        //     for (Vehicle v : vehicles) {
        //         gui.setSpeedLimit(v, speed);
        //         v.update(1);
        //         String s = v.getClass().toString();
        //         System.out.printf("%s speed: %.2f mph", s, gui.getSpeed(v));
        //         System.out.println();

        //     }
        // }
        // sc.close();

    }

    @Override
    public double GetSpeed(Vehicle v) {
        return (Constants.MpsToMph)*v.getCurrentSpeed();
    }

    @Override
    public void SetSpeedLimit(Vehicle v, double speed) {
         v.setDesiredSpeed(speed / Constants.MpsToMph);
    }

}
