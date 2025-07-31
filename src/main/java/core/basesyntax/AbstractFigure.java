package core.basesyntax;

public abstract class AbstractFigure implements AreaCalculator, Drawable {
    private Color color;

    public AbstractFigure(Color color) {
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
