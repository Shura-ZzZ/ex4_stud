public class Triangle extends Shape{
    private  double sideA;
    private  double sideB;
    private  double sideC;
    private Triangle(TriangleBuilder builder){
        super(builder);
        sideA=builder.sideA;
        sideB=builder.sideB;
        sideC=builder.sideC;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +"\n";
    }

    public static class TriangleBuilder extends ShapeBuilder<Triangle, TriangleBuilder> {

        private double sideA;
        private double sideB;
        private double sideC;

        public TriangleBuilder sideA(double val) {
            sideA = val;
            return this;
        }
        public TriangleBuilder sideB(double val) {
            sideB= val;
            return this;
        }

        public TriangleBuilder sideC(double val) {
            sideC = val;
            return this;
        }


        public Triangle build()  {
            if(!isTriagle()) return null;
            return new Triangle(this);
        }

        private boolean isTriagle()
        {
            if(sideA>=sideB+sideC) return false;
            if(sideB>=sideA+sideC) return false;
            if(sideC>=sideB+sideA) return false;
            return true;
        }
    }
}
