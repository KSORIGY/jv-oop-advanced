package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Random rand = new Random();

    public Figure getFigure() {
        int figureType = rand.nextInt(5);
        Color color = colorSupplier.getColor();

        switch (figureType) {
            case 0:
                return new Circle(color, 1 + rand.nextDouble() * 24);
            case 1:
                return new Square(color, 1 + rand.nextDouble() * 24);
            case 2:
                return new Rectangle(color, 1 + rand.nextDouble() * 24,
                        1 + rand.nextDouble() * 24);
            case 3:
                return new RightTriangle(color, 1 + rand.nextDouble() * 24,
                        1 + rand.nextDouble() * 24);
            case 4:
                return new IsoscelesTrapezoid(color, 1 + rand.nextDouble() * 24,
                        1 + rand.nextDouble() * 24, 1 + rand.nextDouble() * 24);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
