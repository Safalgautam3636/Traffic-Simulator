package Dynamic;

import java.util.List;

import Shared.Constants;
import main.CharMatrix;

public class Car extends Vehicle {
    String modelNumber;

    @Override
    protected void accelerate(int delta) {
        setCurrentSpeed(getCurrentSpeed()+(Constants.AccRate * delta));
    }
    @Override
    protected void deaccelerate(int delta) {
        setCurrentSpeed(getCurrentSpeed() - (Constants.DecRate * delta));
    }

    void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    String getModelNumber() {
        return this.modelNumber;
    }
    @Override
    public void printRoadItem(List<DynamicRoadItem> roadItem, CharMatrix charMat) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printRoadItem'");
    }
}
