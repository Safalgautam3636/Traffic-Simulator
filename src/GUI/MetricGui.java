package GUI;

import Dynamic.Vehicle;
import Shared.*;

public class MetricGui implements Gui{

    @Override
    public void setSpeedLimit(Vehicle v, double speed) {
        v.setDesiredSpeed(speed / Constants.MpsToKph);
    }

    @Override
    public double getSpeed(Vehicle v) {
        return v.getCurrentSpeed() * Constants.MpsToKph;
    }
    
    
}
