
package Dynamic;

import RoadItems.RoadItem;
import Shared.*;

public abstract class DynamicRoadItem extends RoadItem {
    
    abstract void update(int second);
}

class Light extends DynamicRoadItem {
    int redTime;
    int yellowTime;
    int greenTime;
    Color lit;
    int timeOn;

    void update(int seconds) {

    }

    Color getLightColor() {
        return this.lit;
    }
}

class Vehicle extends DynamicRoadItem {
    double currentSpeed;
    double desiredSpeed;
    double speedLimit;
    Color color;

    double getCurrentSpeed() {
        return this.currentSpeed;
    }

    double getSpeedLimit() {
        return this.speedLimit;
    }

    void setDesiredSpeed(double speed) {
        this.desiredSpeed = speed;
    }

    void update(int seconds) {

    }
}

class Car extends Vehicle {
    String modelNumber;

    void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    String getModelNumber() {
        return this.modelNumber;
    }
}

class Truck extends Vehicle {
    double loadWeight;
    Color trailerColor;

    void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }
}