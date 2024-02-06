package Static;
import java.util.List;

import RoadItems.RoadItem;
import Shared.Turn;

public class StaticRoadItem extends RoadItem{
    
}

class StopSign extends StaticRoadItem {

}


class Intersection extends StaticRoadItem {
    List<Turn> turns;

    void addTurn(Turn turn) {
        turns.add(turn);
    }

    List<Turn> getTurns() {
        return this.turns;
    }

    Turn getTurn(int index) {
        return this.turns.get(index);
    }
}

class SpeedLimit extends StaticRoadItem {
    double speedLimit;

    double getSpeedLimit(){
        return this.speedLimit;
    }
}

class Yield extends StaticRoadItem {
    
}