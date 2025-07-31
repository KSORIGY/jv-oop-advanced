package core.basesyntax;

public class IsoscelesTrapezoid extends  Figure {
    private double base1, base2;
    private double height;

    public IsoscelesTrapezoid(Color color, double base1, double base2, double height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base2 + base1) * height / 2;
    }

    @Override
    void draw() {
        System.out.printf("Figure: isosceles trapezoid, area: %.2f sq. units, base1: %.2f units, base2: %.2f units, height: %.2f units, color: %s%n",
                getArea(), base1, base2, height, color);
    }
}
