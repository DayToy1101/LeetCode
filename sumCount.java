import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int k = sc.nextInt();
            int sum = sc.nextInt();
            int[] nums = new int[k];
            long[] dp = new long[sum+1];
            dp[0]=1;
            for(int i = 0;i < k;i++){
                nums[i] = sc.nextInt();
                for(int j = sum;j >= nums[i];j--){
                    dp[j] += dp[j-nums[i]];
                }
            }
            System.out.println(dp[sum]);
        }
    }
}