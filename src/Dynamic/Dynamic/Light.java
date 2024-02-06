package Dynamic;
import Shared.Color;

public class Light extends DynamicRoadItem {
    int redTime;
    int yellowTime;
    int greenTime;
    Color light;
    int timeOn;

    void update(int seconds) {
        
    }

    Color getLightColor() {
        return this.light;
    }
}