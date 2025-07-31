package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public Color getColor() {
        int index = new Random().nextInt(Color.values().length);
        Color color = Color.values()[index];
        return color;
    }
}
