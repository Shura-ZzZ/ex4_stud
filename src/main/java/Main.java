import java.util.*;

public class Main {

    public static void main(String[] args) {


        Square sq = new Square();
        Random random= new Random();
//        Triangle t  =  new Triangle(random);
//        System.out.print(t);
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        for (int i = 0; i<num;i++)
        {
            Shape s = new Shape();
            int numShape = random.nextInt(5);
            switch(numShape)
            {
                case 0:
                    s=new Circle(random);
                    break;
                case 1:
                    s=new Triangle(random);
                    break;
                case 2:
                    s=new Rectangle(random);
                    break;
                case 3:
                    s=new Square(random);
                    break;
                case 4:
                    s=new QuilateralTrapezium(random);
                    break;
                default:
                    break;


            }
            System.out.println((i+1)+":"+s.toString());



        }
        in.close();



    }
}
