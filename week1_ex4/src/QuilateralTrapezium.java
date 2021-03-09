public class QuilateralTrapezium extends Shape{
    private double height;
    private double base1;
    private double base2;

    private QuilateralTrapezium(QuilateralTrapeziumBuilder builder)
    {
        super(builder);
        height= builder.height;
        base1 = builder.base1;
        base2 = builder.base2;

    }

    @Override
    public String toString() {
        return super.toString() +
                ", height=" + height +
                ", base1=" + base1 +
                ", base2=" + base2+"\n";

    }
    public static class QuilateralTrapeziumBuilder extends ShapeBuilder<QuilateralTrapezium, QuilateralTrapeziumBuilder> {

        private double height;
        private double base1;
        private double base2;

        public QuilateralTrapeziumBuilder height (double val) {
            height = val;
            return this;
        }
        public QuilateralTrapeziumBuilder base1(double val) {
            base1 = val;
            return this;
        }
        public QuilateralTrapeziumBuilder  base2(double val) {
            base2 = val;
            return this;
        }

        public QuilateralTrapezium build() {
            return new QuilateralTrapezium(this);
        }
    }
}
