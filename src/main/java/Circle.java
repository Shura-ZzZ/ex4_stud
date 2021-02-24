import java.util.Random;

public class Circle extends Shape
{
    private  double radius;

    public Circle()
    {

        radius =1;
    }
    public Circle(Random ran)
    {
        super(ran);
        radius =ran.nextInt(50)+1;
    }

    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "[Circle]\n<" +
                "radius=" + radius +
                " ,MyColor=" + MyColor +
                " ,ContourThickness=" + ContourThickness +
                '>';
    }
}