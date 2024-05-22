package demo;

public class Location {
    //构造数据域
    public int row;
    public int column;
    public double maxValue;

    //构造方法
    public Location() {

    }

    //返回最大值位置
    public static Location locateLargest(double[][] a){
        Location location = new Location();
        location.maxValue = a[0][0];
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[0].length;j++){
                if(a[i][j] > location.maxValue){
                    location.maxValue = a[i][j];
                    location.row = i;
                    location.column = j;
                }
            }
        }
        return location;
    }
}
