public class Solution {
    public int Fibonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        int[] ret = new int[n];
        ret[0]=1;
        ret[1]=1;
        for(int i = 2;i<n;i++){
            ret[i]=ret[i-1]+ret[i-2];
        }
        return ret[n-1];
    }
}