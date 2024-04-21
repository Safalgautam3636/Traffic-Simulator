package RoadItems;

public class RoadItem {
    double mileMarker;
    Road currentRoad;
    RoadItem nextItem;
    RoadItem prevItem;

    double getMileMarker() {
        return this.mileMarker;
    }

    public Road getCurrentRoad() {
        return this.currentRoad;
    }

    void setCurrentRoad(Road road) {
        this.currentRoad = road;
    }

    RoadItem getNext() {
        return this.nextItem;
    }

    void setNext(RoadItem item) {
        this.nextItem = item;
    }

    RoadItem getPrevious() {
        return this.prevItem;
    }

    void setPrevious(RoadItem roadItem) {
        this.prevItem = roadItem;
    }

    void printRoadItem(RoadItem roadItem) {

    }
}
