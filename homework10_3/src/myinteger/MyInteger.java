package myinteger;

public class MyInteger {


    int value;
    public MyInteger(int value){
        this.value=value;
    }
    public int getValue(){
        return value;
    }
    public boolean isEven(){
        return value % 2 == 0;
    }
    public boolean isOdd(){
        return value % 2 != 0;
    }
    public boolean isPrime(){
        for(int x=2;x<value-1;x++){
            if(value%x==0)
                return false;
        }
        return true;
    }
    public boolean isEven(int value){
        return value % 2 == 0;
    }
    public boolean isOdd(int value){
        return value % 2 != 0;
    }
    public boolean isPrime(int value){
        for(int x=2;x<value-1;x++){
            if(value%x==0)
                return false;
        }
        return true;
    }
    public boolean isEven(MyInteger myinteger ){
        return myinteger.getValue() % 2 == 0;
    }
    public boolean isOdd(MyInteger myinteger){
        return myinteger.getValue() % 2 != 0;
    }
    public boolean isPrime(MyInteger myinteger){
        for(int x=2;x<myinteger.getValue()-1;x++){
            if(myinteger.getValue()%x==0)
                return false;
        }
        return true;
    }
    public boolean equals(int value){
        return true;

    }
    public boolean equals(MyInteger myinteger){
        return this.value == myinteger.getValue();
    }
    public static int parseInt(char []c){
        return Integer.parseInt(new String(c));

    }
    public static int parseInt(String s){
        return Integer.parseInt(s);
    }

}

