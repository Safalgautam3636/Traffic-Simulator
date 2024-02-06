import java.util.*;


public abstract class Dynamic extends RoadItem {
    abstract void update(int second);
}

class Light extends Dynamic {
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

class Vehicle extends Dynamic {
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