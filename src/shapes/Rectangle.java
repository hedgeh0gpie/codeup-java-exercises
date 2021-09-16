package shapes;

public class Rectangle {
    protected float length;
    protected float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getArea() {
        return this.length * this.width;
    }

    public float getPerimeter() {
        return (2 * this.length) + (2 * width);
    }
}

