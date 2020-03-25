import java.util.Queue;
import java.util.LinkedList;
public class Solution {
    public void reOrderArray(int [] array) {
        Queue<Integer> s1 = new LinkedList<>();
        Queue<Integer> s2 = new LinkedList<>();
        for(int i = 0 ;i< array.length;i++){
            if(array[i]%2!=0){
                s1.offer(array[i]);
            }else{
                s2.offer(array[i]);
            }
        }
        int i = 0;
        while(!s1.isEmpty()){
            array[i++]=s1.poll();
        }
        while(!s2.isEmpty()){
            array[i++]=s2.poll();
        }
        /*for(int i = 0;i < array.length;i ++){
            for(int j = array.length-1;j>i;j--){
                if(array[i]%2==0&&array[j]%2!=0){
                    swap(array,i,j);
                }
            }
        }*/
        /*int left = 0;
        int right = array.length-1;
        while(left<right){
            if(left<right&&array[left]%2!=0){
                left++;
            }else if(left<right&&array[right]%2==0){
                right--;
            }else if(left<right){
                swap(array,left,right);
            }
        }*/
    }
    /*private void swap(int[] arr,int n,int m){
        int temp = arr[n];
        arr[n]=arr[m];
        arr[m]=temp;
    }*/
}