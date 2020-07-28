import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        int len = A.length;
        int[] B = new int[len];
        B[0] = 1;
        //计算下三角，从上往下计算
        for(int i = 1;i < len;i++){
            B[i] = B[i-1]*A[i-1];
        }
        //计算上三角，从下往上计算
        int tmp = 1;
        for(int j = len-2;j >= 0;j--){
            tmp *= A[j+1];
            B[j] *= tmp;
        }
        return B;
    }
}