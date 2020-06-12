import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i < n;i++){
                arr[i] = sc.nextInt();
            }
            search(arr,n);
        }
    }
    public static void search(int[] arr,int n){
        int[] num = new int[2];
        for(int i =0 ;i < n;i++){
            if(i==0){
                num[0] = -1;
            }
            if(i == n-1){
                num[1] = -1;
            }
            int j = i;
            while(j >= 0&&j <= n-1){
                j-=1;
                if(j>=0){
                    if(arr[i]>arr[j]){
                        num[0] = j;
                        break;
                    }
                }else{
                    num[0] = -1;
                }
            }
            j = i;
            while(j >= 0&&j <= n-1){
                j+=1;
                if(j <= n-1){
                    if(arr[i]>arr[j]){
                        num[1] = j;
                        break;
                    }
                }else{
                    num[1] = -1;
                }
            }
            System.out.println(num[0]+" "+num[1]);
        }
    }
}