package Dynamic;

import Shared.Constants;

public class Car extends Vehicle {
    String modelNumber;

    @Override
    protected void accelerate(int delta) {
        super.setCurrentSpeed(super.getCurrentSpeed()+Constants.AccRate*delta*Constants.MpsToMph);
    }
    @Override
    protected void deaccelerate(int delta) {
        super.setCurrentSpeed(super.getCurrentSpeed() - Constants.DecRate * delta * Constants.MpsToMph);
    }

    void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    String getModelNumber() {
        return this.modelNumber;
    }
}
