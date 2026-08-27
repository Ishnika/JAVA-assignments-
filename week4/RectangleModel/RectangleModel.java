public class RectangleModel {
    public static void main(String[] args) throws Exception {
        Rectangle R1=new Rectangle();
        Rectangle R2=new Rectangle(10);
        Rectangle R3=new Rectangle(10,20);
        Rectangle R4=new Rectangle(-2);
        double ar1=R1.getArea();
        System.out.println("Area 1:"+ar1);
        double ar2=R2.getArea(10);
        System.out.println("Area 2:"+ar2);
        double pr3=R3.getPerimeter();
        System.out.println("perimeter 3:"+pr3);
        boolean sq1=R2.isSquare();
        System.out.println("is square 2:"+sq1);
        boolean sq2=R3.isSquare();
        System.out.println("is square 3:"+sq2);
        
    }
}
