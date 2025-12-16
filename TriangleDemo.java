class Triangle
{
    double dim1;
    double dim2;
    double dim3;

    Triangle()
    {
        dim1=10;
        dim2=20;
        dim3=30;
    }
    Triangle(double dim1)
    {
        this.dim1=dim1;
        this.dim2=dim1;
        this.dim3=dim1;
    }

    Triangle(double dim1,double dim2)
    {
        this.dim1=dim1;
        this.dim2=dim2;
        this.dim3=10;
    }

    Triangle(double dim1,double dim2,double dim3)
    {
        this.dim1=dim1;
        this.dim2=dim2;
        this.dim3=dim3;
    }

    void area(double height,double width)
    {
        System.out.println("Area of Triangle is: "+(0.5*height*width));
    }

    void type()
    {
        if ((dim1==dim2))
        {
            if (dim1==dim3){
                System.out.println("Triangle is Equilateral Triangle::");
            }

        }
        else
        {
            System.out.println("Triangle is not Equilateral Triangle::");
        }
    }

    void Display()
    {
        System.out.println("Triangle Dim1 :" +dim1);
        System.out.println("Triangle Dim2 :" +dim2);
        System.out.println("Triangle Dim3 :" +dim3);
    }
}

public class TriangleDemo
{
    public static void main(String[] args) {
        Triangle t1=new Triangle(15);
        t1.type();
        t1.Display();

        Triangle t2=new Triangle(15,10);
        t2.type();
        t2.Display();

        Triangle t3=new Triangle(2,3,4);
        t3.type();
        t3.Display();

        System.out.println("The area of triangle is ::");
        t3.area(23,10);
        t3.area(10,3);

        Triangle t4=new Triangle();
        t4.Display();
    }   
}