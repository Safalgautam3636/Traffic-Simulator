package GUI;

import Dynamic.Vehicle;
import Shared.*;
public class ImperialGui implements Gui {

    @Override
    public void setSpeedLimit(Vehicle v, double speed) {
        v.setDesiredSpeed(speed / Constants.MpsToMph);
    }

    @Override
    public double getSpeed(Vehicle v) {
        return v.getCurrentSpeed() * Constants.MpsToMph;
    }
    
}
