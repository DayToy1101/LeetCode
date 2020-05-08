
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            float ret = ((count(n)/prob(n))*100);
            System.out.println(String.format("%.2f",ret)+"%");
        }
    }
    private static float count(int n){
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }else{
            return (n-1)*(count(n-1)+count(n-2));
        }
    }
    private static float prob(int n){
        if(n == 0){
            return 1;
        }else{
            return n*prob(n-1);
        }
    }
}