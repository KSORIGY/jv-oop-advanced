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
        return (base2 - base1) * height / 2;
    }

    @Override
    void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, base1: " + base1 + " units, base2: " + base2
                + " units, height: " + height + " units, color: " + color);

    }
}
