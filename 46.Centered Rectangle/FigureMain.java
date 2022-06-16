interface DrawableShape
{
    void draw();
}
abstract class Figure
{
    double dim1,dim2;
    Figure(double a,double b)
    {
        dim1=a;
        dim2=b;
    } 
    abstract double area();
} 
class Rectangle extends Figure
{
    Rectangle(double a,double b)
    {
        super(a,b);
    }

    double area()
    {
        System.out.print("Area for Rectangle : ");
        return dim1*dim2;
    }
}
class CenteredRectangle extends Rectangle implements DrawableShape
{
    int x,y;
    CenteredRectangle(double dim1,double dim2,int x,int y)
    {
        super(dim1,dim2);
        this.x=x;
        this.y=y;
    }
    public void draw()
    {
        System.out.println("The Rectangle will be drawn at center pixel (x,y)="+"("+x+","+y+")");
    }
}
class FigureMain
{
    public static void main(String args[])
    {
        CenteredRectangle crob=new CenteredRectangle(10.0,20.0,5,10);
        System.out.println(crob.area());
        crob.draw();
    }
}