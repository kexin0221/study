package demo1;

public class Test {
    public static void main(String[] args) {
        //匿名对象
        drawMap(new Cycle());
        drawMap(new Rect());
    }
    public static void drawMap(Shape shape){
        shape.draw();
    }
}
