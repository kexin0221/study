public class test {
    public static void main(String[] args) {
        int i=1;
        int num=0;
        for(i=1;i<=100;i++)
        {
            if(i%10==9)
            {
                num++;
            }
            else if(i/10==9)
            {
                num++;
            }
        }
        System.out.println(num);
    }
}
