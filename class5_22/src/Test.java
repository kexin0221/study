class MyValue{
    public int val;
}

public class Test {

    public static void mySwap(MyValue myV1,MyValue myV2){
        int tmp = myV1.val;
        myV1.val = myV2.val;
        myV2.val = tmp;
    }

    public static void main(String[] args){
        MyValue myValue1 = new MyValue();
        MyValue myValue2 = new MyValue();

        myValue1.val = 10;
        myValue2.val = 20;

        System.out.println("交换前："+myValue1.val+","+myValue2.val);
        mySwap(myValue1,myValue2);
        System.out.println("交换后："+myValue1.val+","+myValue2.val);


    }
}
