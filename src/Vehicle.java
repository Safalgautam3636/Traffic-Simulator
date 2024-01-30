public class Vehicle extends Dynamic{
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

    double setDesiredSpeed(double speed) {
        this.desiredSpeed = speed;
    }

    void update(int seconds) {
        
    }
}
