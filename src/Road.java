public class Road {
    String name;
    double length;
    RoadItem head;

    double getLength() {
        return this.length;
    }
    String getRoadName() {
        return this.name;
    }
    void addRoadItem(RoadItem roadItem) {
        head = roadItem;
    }
}
