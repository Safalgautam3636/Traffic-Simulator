
import java.util.*;

import RoadItems.IPrintDriver;
import RoadItems.Road;

class Map {
    private List<Road> roads;

    public Map() {
        roads = new LinkedList<Road>();
    }

    public void AddRoad(Road road) {
        roads.add(road);
    }

    public void Print(IPrintDriver pd, Object o) {
        for (Road road : roads) {
            road.Print(pd, o);
        }
    }
}
