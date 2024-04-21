package Simulation;

import Dynamic.DynamicRoadItem;

import java.util.*;
import Dynamic.Light;
import main.CharMatrix;
import Shared.Color;

public class Simulation {
    public List<DynamicRoadItem> roadItems;

    // public Simulation(List<DynamicRoadItem> roadItems) {
    // this.roadItems = roadItems;
    // }
    public static void printTrafficLights(List<DynamicRoadItem> trafficLights, CharMatrix charMatrix) {
        // First traffic light row index
        int firstTlRowIndex = charMatrix.map.length - 13;
        // Second traffic light row index should be 13 less than the first one
        int secondTlRowIndex = firstTlRowIndex - 13;

        // Print the first traffic light
        Light first = (Light) trafficLights.get(0);
        Light second = (Light) trafficLights.get(1);
        char symbol1 = first.currentColor.equals(Color.RED) ? 'X'
                : first.currentColor.equals(Color.YELLOW) ? '-' : 'O';
        charMatrix.map[firstTlRowIndex][first.mileMarker] = symbol1;

        // Print the second traffic light
        char symbol2 = second.currentColor.equals(Color.RED) ? 'X'
                : second.currentColor.equals(Color.YELLOW) ? '-' : 'O';
        charMatrix.map[secondTlRowIndex][second.mileMarker] = symbol2;
    }

    public void update() {
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
