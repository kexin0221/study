package demo;
//子类新增了一个z属性，并且定义了calculate方法，在此方法内计算了父类和子类中x、y、z属性三者的乘积。
public class Sub extends Base {
    private int z;

    public Sub(int x, int y, int z) {
        //write your code here
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public int calculate() {
        return super.getX() * super.getY() * this.getZ();
    }
}
