import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ColorMap {

    Map<String, Color> map = new HashMap<>();
    List<String> list;

    public ColorMap() {
        ColorsList[] colorsLists = {
                new ColorsList("Blue", Color.BLUE),
                new ColorsList("Yellow", Color.YELLOW),
                new ColorsList("Orange", Color.ORANGE),
                new ColorsList("Red", Color.RED),
                new ColorsList("White", Color.WHITE),
                new ColorsList("Black", Color.BLACK),
                new ColorsList("Green", Color.GREEN)
        };



        for (ColorsList putColorsList: colorsLists){
            map.put(putColorsList.getName(), putColorsList.getColor());
        }
    }
    public Color getValueColor(String name){
        return map.get(name);
    }

    public List<String> getList(){
        return list = new ArrayList<String>(map.keySet());
    }
}
