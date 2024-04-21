package Dynamic;

import java.util.List;

import Shared.*;
import main.CharMatrix;

public class Truck extends Vehicle {
    private double loadWeight;
    Color trailerColor;

    public Truck(int loadWeight) {
        this.loadWeight = loadWeight;
    }

    void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    protected void accelerate(int secondsDelta) {
        if (loadWeight <= 5) {
            setCurrentSpeed(getCurrentSpeed() + (Constants.AccRateEmpty * secondsDelta));
        }
            
        else {
            setCurrentSpeed(getCurrentSpeed() + (Constants.AccRateFull * secondsDelta));
        }
                
    }

    @Override
    protected void deaccelerate(int secondsDelta) {
        if (loadWeight <= 5)
            super.setCurrentSpeed(super.getCurrentSpeed() - Constants.DecRateEmpty * secondsDelta * Constants.MpsToMph);
        else
            super.setCurrentSpeed(super.getCurrentSpeed() - Constants.DecRateFull * secondsDelta * Constants.MpsToMph);
    }

    @Override
    public void printRoadItem(List<DynamicRoadItem> roadItem, CharMatrix charMat) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printRoadItem'");
    }
}