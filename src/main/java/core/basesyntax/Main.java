package core.basesyntax;

public class Main {
    private static final int ARRAY_OF_FIGURES_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[ARRAY_OF_FIGURES_SIZE];

        int halfSizeArray = ARRAY_OF_FIGURES_SIZE / 2;

        for (int i = 0; i < ARRAY_OF_FIGURES_SIZE; i++) {
            figures[i] = (i < halfSizeArray)
                    ? figureSupplier.getFigure()
                    : figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
