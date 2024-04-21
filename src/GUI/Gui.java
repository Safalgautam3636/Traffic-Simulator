package GUI;

import Dynamic.Vehicle;
import RoadItems.Heading;
import RoadItems.Road;
import Shared.ISimInput;
import Shared.ISimOutput;

public abstract class Gui implements ISimInput, ISimOutput {
    public abstract Road CreateRoad(String name, double locx, double locy, double len, Heading hdg);

    public abstract double GetSpeed(Vehicle v);

    public abstract void SetSpeedLimit(Vehicle v, double speed);
}
