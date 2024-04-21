package Simulation;

import Dynamic.DynamicRoadItem;

import java.util.*;
public class Simulation {
    public List<DynamicRoadItem> roadItems;

    // public Simulation(List<DynamicRoadItem> roadItems) {
    //     this.roadItems = roadItems;
    // }

    public void update(int second) {
        for (DynamicRoadItem item : roadItems) {
            item.update(1);
        }
    }

    public void addDynamicRoadItem(DynamicRoadItem dynamicRoadItem) {
        if (roadItems == null) {
            roadItems = new ArrayList<>();
        }
        roadItems.add(dynamicRoadItem);
    }
    
}
