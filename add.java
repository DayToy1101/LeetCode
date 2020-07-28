public class Solution {
    public int Add(int num1,int num2) {
        if(num2 == 0){
            return num1;
        }
        int sum = 0;
        int ret = 0;
        while(num2 != 0){
            sum = num1^num2;
            ret = (num1&num2) << 1;
            num1 = sum;
            num2 = ret;
        }
        return num1;
    }
}