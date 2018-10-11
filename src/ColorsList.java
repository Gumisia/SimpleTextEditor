import java.awt.*;

public class ColorsList {

    String name;
    Color color;

    ColorsList(String name, Color color){
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }
}
