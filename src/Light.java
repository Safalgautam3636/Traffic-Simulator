public class Light extends Dynamic{
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
