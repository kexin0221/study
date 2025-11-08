import java.util.Arrays;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
//        输入：nums = [2,7,11,15], target = 9
//        输出：[0,1]
        Scanner input=new Scanner(System.in);
        int[] nums={2,7,11,15};
        System.out.println("input a target:");
        int target=input.nextInt();
        sum(nums,target);
    }
    public static void sum(int[] nums,int key){
        int[] ret=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==key){
                    ret[0]=i;
                    ret[1]=j;
                    break;
                }
            }
        }
        System.out.println("the index are "+ Arrays.toString(ret));
    }
}
