package Shared;

import Dynamic.Vehicle;

public class ImperialOutput implements ISimOutput {
    public double GetSpeed(Vehicle v) {
        return v.getCurrentSpeed();
    }
}
