import java.awt.*;

public class Circle extends Shape{
    private double radius;


    private Circle(CircleBuilder builder) {
        super(builder);
        radius = builder.radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", radius=" + radius+"\n";
    }

    public static class CircleBuilder extends ShapeBuilder<Circle, CircleBuilder> {

        private double radius;

        public CircleBuilder radius(double val) {
            radius = val;
            return this;
        }

        public Circle build() {
            return new Circle(this);
        }
    }
}
