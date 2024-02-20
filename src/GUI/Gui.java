package GUI;

import Dynamic.Vehicle;
import Shared.ISimInput;
import Shared.ISimOutput;

public interface Gui extends ISimInput,ISimOutput  {
    abstract void setSpeedLimit(Vehicle v, double speed);
    abstract double getSpeed(Vehicle v);
}
