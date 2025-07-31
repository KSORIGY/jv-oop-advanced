package core.basesyntax;

public abstract class Figure {
    Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public abstract double getArea();
    abstract void draw();

}
