package demo;

//正n边形类
public class RegularPolygon {
    // 私有数据域
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    // 无参构造方法
    public RegularPolygon() {

    }

    // 带n和side的构造方法
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    // 带n、side、x、y的构造方法
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // 数据域的修改器和访问器
    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // 获取周长的方法
    public double getPerimeter() {
        return n * side;
    }

    // 获取面积的方法
    public double getArea() {
        return (n * side * side) /
                (4 * Math.tan(Math.PI / n));
    }
}


