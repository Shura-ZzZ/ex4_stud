import java.awt.*;
import java.util.Random;

public class Shape {
    protected Color MyColor;
    protected int ContourThickness;

    public Shape()
    {
        MyColor = Color.BLACK;
        ContourThickness = 1;


    };
    public Shape(Random ran)
    {
        int r = ran.nextInt(256);
        int g = ran.nextInt(256);
        int b = ran.nextInt(256);
        MyColor=new Color(r,g,b);
        ContourThickness = 1+ ran.nextInt(50);


    }




    public int getContourThickness() {
        return ContourThickness;
    }

    public Color getMyColor() {
        return MyColor;
    }


    public void setMyColor(Color color) {
        MyColor = color;
    }

    public void setContourThickness(int contourThickness) {
        ContourThickness = contourThickness;
    }

    @Override
    public String toString() {
        return "[Shape]\n<" +
                "MyColor=" + MyColor +
                ", ContourThickness=" + ContourThickness +
                '>';
    }
}
