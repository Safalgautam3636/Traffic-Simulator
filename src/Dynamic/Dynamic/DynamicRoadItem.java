
package Dynamic;

import RoadItems.RoadItem;
import Shared.*;

public abstract class DynamicRoadItem extends RoadItem {
    
    abstract void update(int second);
}