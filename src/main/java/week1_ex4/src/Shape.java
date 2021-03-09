import java.awt.*;

public class Shape {
    private Color myColor;
    private int contourThickness;
//    public Shape(Color color, int contourThickness) {
//        this.contourThickness = contourThickness;
//        this.myColor = color;
//    }
    protected Shape(ShapeBuilder builder)
    {
        this.myColor = builder.color;
        this.contourThickness = builder.contourThickness;
    }

        @Override
        public String toString() {
        return this.getClass().getSimpleName()+"\n" +
                "MyColor=" + myColor +
                ", ContourThickness=" + contourThickness;
    }
    public static abstract class ShapeBuilder<T extends Shape, B extends ShapeBuilder<T, B>> {

        protected Color color = Color.BLACK;
        protected int contourThickness=1;

        @SuppressWarnings("unchecked")
        public B color(Color color) {
            this.color = color;
            return (B) this;
        }

        @SuppressWarnings("unchecked")
        public B contourThickness(int contourThickness) {
            this.contourThickness = contourThickness;
            return (B) this;
        }

        public abstract T build();
    }


}
