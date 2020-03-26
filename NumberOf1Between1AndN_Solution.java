public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for(int i = 1;i <= n;i ++){
            if(i==1){
                count = 1;
            }
            int num = i;
            while(num>1){
                if((num%10)==1){
                    count++;
                }
                if((num/10)==1){
                    count++;
                }
                num /= 10;
            }
        }
        return count;
    }
}