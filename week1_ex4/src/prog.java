import java.util.ArrayList;
import java.util.Scanner;

public class prog {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int count = in.nextInt();
        ArrayList<Shape> list = ShapeFabric.generateList(count);
        System.out.println(list);
        in.close();
    }
}
