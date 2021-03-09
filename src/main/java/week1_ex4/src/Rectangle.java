public class Rectangle extends Shape{
    protected double height;
    protected double width;

    private Rectangle(RectangleBuilder builder) {
        super(builder);
        height= builder.height;
        width = builder.width;
    }

    @Override
    public String toString() {
        return  super.toString()+
                ", height=" + height +
                ", width=" + width+"\n";
    }
    public static  class RectangleBuilder extends ShapeBuilder<Rectangle, RectangleBuilder> {

        private double height;
        private double width;
        public RectangleBuilder height(double val)
        {
            height = val;
            return  this;
        }
        public RectangleBuilder width(double val)
        {
            width= val;
            return  this;
        }

        public  Rectangle build(){
            return new Rectangle(this);
        }
    }


}
