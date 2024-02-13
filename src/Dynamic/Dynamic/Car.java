package Dynamic;

import Shared.Constants;

public class Car extends Vehicle {
    String modelNumber;

    @Override
    protected void accelerate(int delta) {
        setCurrentSpeed(getCurrentSpeed()+(Constants.AccRate * delta * Constants.MpsToMph));
    }
    @Override
    protected void deaccelerate(int delta) {
        setCurrentSpeed(getCurrentSpeed() - (Constants.DecRate * delta * Constants.MpsToMph));
    }

    void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    String getModelNumber() {
        return this.modelNumber;
    }
}
