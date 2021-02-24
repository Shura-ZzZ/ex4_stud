import java.util.Random;

public class Triangle extends Shape{
    private  double sideA;
    private  double sideB;
    private  double sideC;

    public Triangle()
    {
        sideA=1;
        sideB=1;
        sideC=1;

    }
    public Triangle(Random ran)
    {
        super(ran);
        sideA = ran.nextInt(50)+1;
        sideB = ran.nextInt(50)+1;

        int A =(int)(sideA+sideB);
        int  B = (int)(Math.abs(sideA-sideB)+1);
        sideC = ran.nextInt((A-B))+B;

    }

    public void setSideA(double sideA) throws Exception{
        double tmp=this.sideA;
        this.sideA = sideA;
        if(!isTriagle()) {
        this.sideA=tmp;
        throw new Exception("Error:checking the triangle");}

    }

    public void setSideB(double sideB) throws Exception{
        double tmp=this.sideB;
        this.sideB = sideB;
        if(!isTriagle()) {
            this.sideA=tmp;
            throw new Exception("Error:checking the triangle");}
    }

    public void setSideC(double sideC) throws Exception {
        double tmp=this.sideC;
        this.sideC = sideC;
        if(!isTriagle()) {
            this.sideA=tmp;
            throw new Exception("Error:checking the triangle");}
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    private boolean isTriagle()
    {
        if(sideA>=sideB+sideC) return false;
        if(sideB>=sideA+sideC) return false;
        if(sideC>=sideB+sideA) return false;
        return true;


    }

    @Override
    public String toString() {
        return "[Triangle]\n<" +
                "MyColor=" + MyColor +
                ", ContourThickness=" + ContourThickness +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '>';
    }
}
