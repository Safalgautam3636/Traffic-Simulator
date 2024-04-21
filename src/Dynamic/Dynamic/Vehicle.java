package Dynamic;

import Shared.Color;

public abstract class Vehicle extends DynamicRoadItem {
    private double currentSpeed = 0.0;
    private double desiredSpeed;
    protected double speedLimit;
    protected Color color;

    protected abstract void accelerate(int secondsDelta);

    protected abstract void deaccelerate(int secondsDelta);

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    protected void setCurrentSpeed(double speed) {
        // this is when given speed is greater than the current speed
        if (currentSpeed <= speed) {
            // when current speed is greater than the desired speed
            if (speed > desiredSpeed) {
                currentSpeed = desiredSpeed;
            } else {
                currentSpeed = speed;
            }
        } else {
            // current speed is less than the desired speed
            if (speed < desiredSpeed) {
                currentSpeed = desiredSpeed;
            } else {
                currentSpeed = speed;
            }
        }
    }

    public double getSpeedLimit() {
        return speedLimit;
    }

    public void setDesiredSpeed(double speed) {
        desiredSpeed = speed;
    }

    public void update(int seconds) {
        if (seconds > desiredSpeed) {
            deaccelerate(seconds);
        } else if (seconds < desiredSpeed) {
            accelerate(seconds);
        }
    }
}