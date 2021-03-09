import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class ShapeFabric {
    private static Random ran = new Random();

    public static ArrayList<Shape> generateList(int count) {
        ArrayList<Shape> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {

            int numShape = random.nextInt(5);
            switch (numShape) {
                case 0:
                    list.add(generateCircle());
                    break;
                case 1:
                    list.add(generateTriagle());
                    break;
                case 2:
                    list.add(generateRectangle());
                    break;
                case 3:
                    list.add(generateSquare());
                    break;
                case 4:
                    list.add(generateQuilateralTrapezium());
                    break;
                default:
                    break;
            }

        }
        return list;

    }

    public static Triangle generateTriagle() {
        //Random ran = new Random();
        Color myColor = randomColor();
        int contourThickness = 1 + ran.nextInt(50);
        double sideA = ran.nextInt(50) + 1;
        double sideB = ran.nextInt(50) + 1;
        int A = (int) (sideA + sideB);
        int B = (int) (Math.abs(sideA - sideB) + 1);
        double sideC = ran.nextInt((A - B)) + B;
        return new Triangle.TriangleBuilder()
                .color(myColor)
                .contourThickness(contourThickness)
                .sideA(sideA)
                .sideB(sideB)
                .sideC(sideC)
                .build();
    }

    public static Square generateSquare() {
        // Random ran = new Random();
        Color myColor = randomColor();
        int contourThickness = 1 + ran.nextInt(50);
        double height = ran.nextInt(50) + 1;
        return new Square.SquareBuilder()
                .color(myColor)
                .contourThickness(contourThickness)
                .height(height)
                .build();

    }

    public static Circle generateCircle() {
        // Random ran = new Random();
        Color myColor = randomColor();
        int contourThickness = 1 + ran.nextInt(50);
        double radius = ran.nextInt(50) + 1;
        return new Circle.CircleBuilder()
                .color(myColor)
                .contourThickness(contourThickness)
                .radius(radius)
                .build();
    }

    public static QuilateralTrapezium generateQuilateralTrapezium() {
        //  Random ran = new Random();
        Color myColor = randomColor();
        int contourThickness = 1 + ran.nextInt(50);
        double height = ran.nextInt(50) + 1;
        double base1 = ran.nextInt(50) + 1;
        double base2 = ran.nextInt(50) + 1;
        return new QuilateralTrapezium.QuilateralTrapeziumBuilder()
                .color(myColor)
                .contourThickness(contourThickness)
                .base1(base1)
                .base2(base2)
                .height(height)
                .build();

    }

    public static Rectangle generateRectangle() {
        //  Random ran = new Random();
        Color myColor = randomColor();
        int contourThickness = 1 + ran.nextInt(50);
        double height = ran.nextInt(50) + 1;
        double width = ran.nextInt(50) + 1;
        return new Rectangle.RectangleBuilder()
                .color(myColor)
                .contourThickness(contourThickness)
                .height(height)
                .width(width)
                .build();

    }

    private static Color randomColor() {
        //   Random ran = new Random();
        int r = ran.nextInt(256);
        int g = ran.nextInt(256);
        int b = ran.nextInt(256);
        return new Color(r, g, b);
    }

}
