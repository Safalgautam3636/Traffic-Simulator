
import Shared.*;
import Dynamic.Car;
import RoadItems.*;
import main.CharMatrix;

public class ConsolePrint implements IPrintDriver {

    @Override
    public void PrintRoad(Road road, Object o) {
        CharMatrix cm = (CharMatrix) o;
        int x, y;
        int CCx = Conversions.WCpointToCCpoint(road.GetXLocation());
        int CCy = Conversions.WCpointToCCpoint(-road.GetYLocation());
        int distance = 0;
        int CCRoadLength = Conversions.WClengthToCClength(road.GetLength());

        switch (road.GetHeading()) {
            case North:
                x = (int) CCx;
                if (x >= 0 && x < Constants.CharMapSize) {
                    while (distance < CCRoadLength) {
                        y = (int) (CCy - distance);
                        if (y >= 0 && y < Constants.CharMapSize) {
                            cm.map[y][x] = '|';
                            cm.map[y][x + 2] = '|';
                            cm.map[y][x + 4] = '|';
                        }
                        distance += 1;
                    }
                }
                break;
            case South:
                break;
            case East:
                y = (int) CCy;
                if (y >= 0 && y < Constants.CharMapSize) {
                    while (distance < CCRoadLength) {
                        x = (int) (CCx + distance);
                        if (x >= 0 && x < Constants.CharMapSize) {
                            cm.map[y][x] = '-';
                            cm.map[y + 2][x] = '-';
                            cm.map[y + 4][x] = '-';
                        }
                        distance += 1;
                    }
                }
                break;
            case West:
                break;
            default:
                break;
        }
    }

    @Override
    public void PrintCar(Car car, Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'PrintCar'");
    }
}