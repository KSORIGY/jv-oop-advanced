package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Random rand = new Random();

    private double randSize() {
        return 1 + rand.nextDouble() * 24;
    }

    public Figure getFigure() {
        int figureType = rand.nextInt(5);
        Color color = colorSupplier.getColor();

        switch (figureType) {
            case 0:
                return new Circle(color, randSize());
            case 1:
                return new Square(color, randSize());
            case 2:
                return new Rectangle(color, randSize(), randSize());
            case 3:
                return new RightTriangle(color, randSize(), randSize());
            case 4:
                return new IsoscelesTrapezoid(color, randSize(), randSize(), randSize());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
