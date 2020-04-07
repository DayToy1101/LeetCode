
import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            int[] nums = new int[strs.length-1];
            for(int i=0;i<strs.length-1;i++){
                nums[i]=Integer.valueOf(strs[i]);
            }
            int k = Integer.valueOf(strs[strs.length-1]);
            Arrays.sort(nums);
            for(int i=0;i<k;i++){
                System.out.print(nums[i]);
                if(i != k-1){
                    System.out.print(" ");
                }
            }
        }
    }
}