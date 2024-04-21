package Dynamic;

import Shared.Color;
import main.CharMatrix;
import java.util.*;

public class Light extends DynamicRoadItem {
    int redTime;
    int yellowTime;
    int greenTime;
    public String currentColor;
    int timer;
    public int mileMarker;

    public Light(int redTime, int yellowTime, int greenTime, String currentColor, int mileMarker) {

        this.redTime = redTime;
        this.yellowTime = yellowTime;
        this.greenTime = greenTime;
        this.currentColor = currentColor;
        this.timer = 0;
        this.mileMarker = mileMarker;
    }

    public void update(int seconds) {
        this.timer += 1;
        int duration = this.redTime + this.greenTime + this.yellowTime;
        this.timer = this.timer % duration;
        if (this.timer <= this.redTime) {
            this.currentColor = Color.RED;
        } else if (this.timer <= this.redTime + this.yellowTime) {
            this.currentColor = Color.YELLOW;
        } else {
            this.currentColor = Color.GREEN;
        }

    }

    // @Override
    // public void printRoadItem(List<Light> trafficLights, CharMatrix charMatrix) {
    // super.printRoadItem(trafficLights, charMatrix); // Call the superclass method
    // // Iterate through each traffic light
    // for (Light tl : trafficLights) {
    // // Get the symbol corresponding to the current color of the traffic light
    // char symbol = getSymbolForColor(tl.currentColor);
    // // Get the position of the traffic light
    // int row_index = charMatrix.map.length - 1; // Assuming traffic light is at
    // the bottom
    // int column_index = tl.mileMarker;
    // // Search for the closest '|' character in the column and update it with the
    // symbol
    // for (int i = row_index; i >= 0; i--) {
    // if (charMatrix.map[i][column_index] == '|') {
    // charMatrix.map[i][column_index] = symbol;
    // break;
    // }
    // }
    // }
    // }

    public void printRoadItem(List<DynamicRoadItem> roadItems, CharMatrix charMatrix) {
        // Iterate through each road item
        for (DynamicRoadItem roadItem : roadItems) {
            // Check if the road item is a Light instance
            if (roadItem instanceof Light) {
                Light tl = (Light) roadItem; // Cast to Light
                // Get the symbol corresponding to the current color of the traffic light
                char symbol = getSymbolForColor(tl.currentColor);
                System.out.println(symbol);

                int firstTlRowIndex = charMatrix.map.length - 1;
                charMatrix.map[firstTlRowIndex][tl.mileMarker] = symbol;
                // Get the position of the traffic light
                // int row_index = charMatrix.map.length-1; // Assuming traffic light is at the
                // bottom
                // int column_index = tl.mileMarker;
                // Search for the closest '|' character in the column and update it with the
                // symbol
                // for (int i = row_index; i >= 0; i--) {
                // if (charMatrix.map[i][column_index] == '|') {
                // charMatrix.map[i][column_index] = symbol;
                // break;
                // }
                // }
            }
        }
    }
    // int firstTlRowIndex = charMatrix.map.length - 13;
    // // Second traffic light row index should be 13 less than the first one
    // int secondTlRowIndex = firstTlRowIndex - 13;

    // // Print the first traffic light
    // char symbol1 = trafficLights.get(0).currentColor.equals(Color.RED) ? 'X'
    // : trafficLights.get(0).currentColor.equals(Color.YELLOW) ? '-' : 'O';
    // charMatrix.map[firstTlRowIndex][trafficLights.get(0).mileMarker] = symbol1;

    private static char getSymbolForColor(String color) {
        switch (color) {
            case "RED":
                return 'X';
            case "YELLOW":
                return '-';
            case "GREEN":
                return 'O';
            default:
                return ' '; // Default to space if color is not recognized
        }

    }
}