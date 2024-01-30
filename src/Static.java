import java.util.List;

public class Static extends RoadItem{
    
}

class StopSign extends Static {

}


class Intersection extends Static {
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

class SpeedLimit extends Static {
    double speedLimit;

    double getSpeedLimit(){
        return this.speedLimit;
    }
}

class Yield extends Static {
    
}