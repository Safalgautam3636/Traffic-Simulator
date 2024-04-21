
package Dynamic;

import RoadItems.RoadItem;
import main.CharMatrix;
import java.util.*;

public abstract class DynamicRoadItem extends RoadItem {

    public abstract void update(int second);

    public abstract void printRoadItem(List<DynamicRoadItem> roadItem, CharMatrix charMat);
}