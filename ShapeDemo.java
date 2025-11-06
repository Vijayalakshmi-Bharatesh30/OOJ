abstract class Shape {
    int dim1, dim2;
    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int a, int b) {
        dim1 = a;
        dim2 = b;
    }

    void printArea() {
        System.out.println("Area of Rectangle: " + (dim1 * dim2));
    }
}

class Triangle extends Shape {
    Triangle(int a, int b) {
        dim1 = a;
        dim2 = b;
    }

    void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * dim1 * dim2));
    }
}

class Circle extends Shape {
    Circle(int r) {
        dim1 = r;
    }

    void printArea() {
        System.out.println("Area of Circle: " + (Math.PI * dim1 * dim1));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(10, 8);
        Circle c = new Circle(7);

        r.printArea();
        t.printArea();
        c.printArea();
    }
}
