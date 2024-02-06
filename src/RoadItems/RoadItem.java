package RoadItems;

public class RoadItem {
    double mileMarker;
    Road currentRoad;
    RoadItem nextItem;
    RoadItem prevItem;
    
    double getMileMarker() {
        return this.mileMarker;
    }

    Road getCurrentRoad() {
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

    void setPrevioud(RoadItem roadItem) {
        this.prevItem = roadItem;
    }
}
