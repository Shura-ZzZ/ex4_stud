import java.util.Random;

public class QuilateralTrapezium extends Shape{
    private double height;
    private double base1;
    private double base2;

    public QuilateralTrapezium()
    {
        base1=1;
        base2=2;
        height = 1;

    }
    public QuilateralTrapezium(Random ran)
    {
        super(ran);
        base1=ran.nextInt(50)+1;
        base2=ran.nextInt(50)+1;
        height=ran.nextInt(50)+1;



    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase1(double base1) {
        this.base1 = base1;
    }

    public void setBase2(double base2) {
        this.base2 = base2;
    }

    public double getBase1() {
        return base1;
    }

    public double getBase2() {
        return base2;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "[QuilateralTrapezium]\n<" +
                "height=" + height +
                ", base1=" + base1 +
                ", base2=" + base2 +
                ", MyColor=" + MyColor +
                ", ContourThickness=" + ContourThickness +
                '>';
    }
}
