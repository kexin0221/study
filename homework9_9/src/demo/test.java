package demo;

public class test {
    public static void main(String[] args) {
        RegularPolygon r1=new RegularPolygon();
        RegularPolygon r2=new RegularPolygon(6,4);
        RegularPolygon r3=new RegularPolygon(10,4,5.6,7.8);

        System.out.println("周长："+r1.getPerimeter()+"\n面积："+r1.getArea());
        System.out.println("周长："+r2.getPerimeter()+"\n面积："+r2.getArea());
        System.out.println("周长："+r3.getPerimeter()+"\n面积："+r3.getArea());
    }
}


