import java.util.*;

public class Printer {
    public int[] arrayPrint(int[][] arr, int n) {
        // write code here
        int[] ret = new int[n*n];
        int index = 0;
        int begin = 0;
        int end = n-1;
        while(begin < n){
            int i = begin;
            int j = end;
            while(i<n&&j<n){
                ret[index++] = arr[i++][j++];
            }
            if(end>0){
                end --;
            }else{
                begin++;
            }
        }
        return ret;
    }
}