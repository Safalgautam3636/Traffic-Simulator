import Dynamic.Vehicle;
import GUI.*;
import RoadItems.Heading;
import RoadItems.IPrintDriver;
import RoadItems.Road;
import Shared.*;
import main.CharMatrix;
import Simulation.Simulation;
import Dynamic.Light;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import Dynamic.DynamicRoadItem;
import java.util.*;

public class App implements ISimInput, ISimOutput {
    private static void clearScreen() {
        System.out.print("\u001b[H\u001b[2J");
        System.out.flush();
    }

    // public static void printTrafficLights(List<DynamicRoadItem> trafficLights,
    // CharMatrix charMatrix) {
    // // First traffic light row index
    // int firstTlRowIndex = charMatrix.map.length - 13;
    // // Second traffic light row index should be 13 less than the first one
    // int secondTlRowIndex = firstTlRowIndex - 13;

    // // Print the first traffic light
    // Light first = (Light) trafficLights.get(0);
    // Light second = (Light) trafficLights.get(1);
    // char symbol1 = first.currentColor.equals(Color.RED) ? 'X'
    // : first.currentColor.equals(Color.YELLOW) ? '-' : 'O';
    // charMatrix.map[firstTlRowIndex][first.mileMarker] = symbol1;

    // // Print the second traffic light
    // char symbol2 = second.currentColor.equals(Color.RED) ? 'X'
    // : second.currentColor.equals(Color.YELLOW) ? '-' : 'O';
    // charMatrix.map[secondTlRowIndex][second.mileMarker] = symbol2;
    // }

    // public static void main(String[] args) throws Exception {
    // System.out.println(Constants.AccRate);
    // Gui simInput;
    // Map map = new Map();
    // IPrintDriver cp = new ConsolePrint();
    // simInput = new MetricGui();
    // Road Uptown = simInput.CreateRoad("Uptown", 0.0, -0.09, .180, Heading.North);
    // map.AddRoad(Uptown);
    // // Road Crosstown = simInput.CreateRoad("Crosstown", -0.09, 0.0, .180,
    // // Heading.East);
    // // map.AddRoad(Crosstown);

    // Light t1 = new Light(5, 2, 3, Color.GREEN, 13);
    // Light t2 = new Light(5, 2, 3, Color.GREEN, 26);

    // Simulation sim = new Simulation();
    // sim.addDynamicRoadItem(t1);
    // sim.addDynamicRoadItem(t2);

    // for (int timeStep = 0; timeStep < 30; timeStep++) {

    // CharMatrix cm = new CharMatrix();
    // map.Print(cp, cm);
    // sim.update(1);

    // for (int i = 0; i < Constants.CharMapSize; i++) {
    // String s = new String(cm.map[i]);
    // System.out.println(s);
    // }
    // }
    // }

    // @Override
    // public double GetSpeed(Vehicle v) {
    // return (Constants.MpsToMph) * v.getCurrentSpeed();
    // }

    // @Override
    // public void SetSpeedLimit(Vehicle v, double speed) {
    // v.setDesiredSpeed(speed / Constants.MpsToMph);
    // }

    // }
    public static void main(String[] args) throws Exception {
        Gui simInput;
        Map map = new Map();
        IPrintDriver cp = new ConsolePrint();
        simInput = new MetricGui();
        Road uptown = simInput.CreateRoad("Uptown", 0.0, -0.09, 0.180, Heading.North);
        map.AddRoad(uptown);

        Light t1 = new Light(5, 3, 5, Color.GREEN, 13);
        Light t2 = new Light(5, 3, 3, Color.GREEN, 26);

        Simulation sim = new Simulation();
        sim.addDynamicRoadItem(t1);
        sim.addDynamicRoadItem(t2);

        // Create a scheduled executor service to update the simulation every second
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        executor.scheduleAtFixedRate(() -> {
            clearScreen(); // Clear the screen
            CharMatrix cm = new CharMatrix(); // Create a new CharMatrix
            map.Print(cp, cm); // Print the map
            sim.update(); // Update the simulation
            Simulation.printTrafficLights(sim.roadItems, cm);

            // Print the updated map
            for (int i = 0; i < Constants.CharMapSize; i++) {
                String s = new String(cm.map[i]);
                System.out.println(s);
            }

        }, 0, 1, TimeUnit.SECONDS); // Initial delay 0, run every 1 second

        // Shutdown the executor after some time (e.g., after 30 seconds)
        executor.schedule(() -> executor.shutdown(), 10, TimeUnit.SECONDS);
    }

    @Override
    public double GetSpeed(Vehicle v) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'GetSpeed'");
    }

    @Override
    public void SetSpeedLimit(Vehicle v, double speed) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'SetSpeedLimit'");
    }
}
