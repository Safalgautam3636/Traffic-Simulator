package Shared;

import Dynamic.Vehicle;

public class ImperialOutput implements ISimOutput {
    public double getSpeed(Vehicle v) {
        return v.getCurrentSpeed();
    }
}
