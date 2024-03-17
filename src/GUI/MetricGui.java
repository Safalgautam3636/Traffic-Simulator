package GUI;

import Dynamic.Vehicle;
import RoadItems.Heading;
import RoadItems.Road;
import Shared.*;

public class MetricGui extends Gui {
    @Override
            public double  GetSpeed(Vehicle v)
            {
                return v.getCurrentSpeed() * Constants.MpsToKph;
            }
        @Override
        public  void SetSpeedLimit(Vehicle v, double speed)
        {
            v.setDesiredSpeed(speed / Constants.MpsToKph);
        }

    public  Road CreateRoad(String name, double locx, double locy, double len, Heading hdg)
        {
            return new Road(name, locx / Constants.MetersToKm, locy / Constants.MetersToKm, len / Constants.MetersToKm, hdg);
        }
    
    
}

