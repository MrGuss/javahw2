import java.lang.Math;
public class Circle {
    double d, x, y;
    public Circle(double d, double x, double y){
        this.d = d;
        this.x = x;
        this.y = y;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getD() {
        return this.d;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.d, d) == 0 && Double.compare(circle.x, x) == 0 && Double.compare(circle.y, y) == 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "d=" + this.getD() +
                ", x=" + this.getX() +
                ", y=" + this.getY() +
                '}';
    }

    public double area(){
        return Math.PI*Math.pow(this.d/2, 2);
    }

    public double length(){
        return Math.PI*this.d;
    }

}
