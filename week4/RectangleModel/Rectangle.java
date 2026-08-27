public class Rectangle {
    private double width;
    private double height;
    Rectangle()
    {
    this(1,1);
    }
    Rectangle(double side)
    {
        this(side,side);
    }
    Rectangle(double b,double h)
    {
        if(b>0 && h>0)
        {
            width=b;
            height=h;
        }
    }
    public double getArea()
    {
        double area =width*height;
        return area;
    }
    public double getArea(double b)
    {
        double area=b*height;
        return area;
    }
    public double getPerimeter()
    {
        double perimeter =2*(width+height);
        return perimeter;
    }
    public boolean isSquare()
    {
        if(width==height)
            return true ;
        return false ;
    }
    public void scale(double factor)
    {
        width*=factor;
        height*=factor;
        double ar=getArea();
        System.out.println("New area :"+ar);
        double per=getPerimeter();
        System.out.println("New perimeter: "+per);
    }
    public String toString()
    {
        String w=String.valueOf(width);
        String h=String.valueOf(height);
        return ("height"+height+"width"+width);
    }
}
