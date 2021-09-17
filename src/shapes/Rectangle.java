package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(float length, float width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return (2 * this.length) + (2 * width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
//    protected float length;
//    protected float width;
//
//    public Rectangle(float length, float width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public float getArea() {
//        return this.length * this.width;
//    }
//
//    public float getPerimeter() {
//        return (2 * this.length) + (2 * width);
//    }
}

