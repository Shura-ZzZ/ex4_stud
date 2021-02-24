import java.util.Random;

public class Rectangle extends Shape{
    protected double height;
    protected double width;
    public Rectangle()
    {
        height=1;
        width =2;

    }
    public Rectangle(Random ran)
    {
        super(ran);
        height=ran.nextInt(50)+1;
        width= ran.nextInt(50)+1;

    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "[Rectangle] \n<" +
                ", height=" + height +
                ", width=" + width +
                ", MyColor=" + MyColor +
                ", ContourThickness=" + ContourThickness +
                '>';
    }
}
