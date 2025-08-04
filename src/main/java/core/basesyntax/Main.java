package core.basesyntax;

public class Main {
    private static final int ARRAY_OF_FIGURES_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[ARRAY_OF_FIGURES_SIZE];

        //Fill the first half of array with random figures
        for (int i = 0; i < 3; i++) {
            figures[i] = figureSupplier.getFigure();
        }

        //Fill the second half of array with default figures
        for (int i = 3; i < 6; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
