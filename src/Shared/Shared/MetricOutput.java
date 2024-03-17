package Shared;

import Dynamic.Vehicle;

public class MetricOutput implements ISimOutput {
    public double GetSpeed(Vehicle v) {
        return v.getCurrentSpeed()*1.6;
    }
}