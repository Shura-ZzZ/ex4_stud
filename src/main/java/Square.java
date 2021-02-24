import java.util.Random;

public class Square extends Shape{

   private double height;

   public Square()
   {
       height=1;
   }
   public Square(Random ran)
   {
       height=ran.nextInt(50)+1;
   }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "[Square]\n<" +
                "MyColor=" + MyColor +
                ", ContourThickness=" + ContourThickness +
                ", height=" + height +
                '>';
    }
}
