public class Square extends Shape{

    private double height;

    private Square(SquareBuilder builder)
    {
        super(builder);
        height= builder.height;
    }
    @Override
    public String toString() {
        return super.toString()+
                ", height=" + height +"\n";
    }
    public static class SquareBuilder extends ShapeBuilder<Square, SquareBuilder> {

        private double height;

        public SquareBuilder height(double val) {
            height = val;
            return this;
        }

        public Square build() {
            return new Square(this);
        }
    }
}
