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
            Map<Integer,Integer> map = new TreeMap<>();
            for(int i = 0;i < n;i++){
                if(map.containsKey(arr[i])){
                    map.put(arr[i],map.get(arr[i])+1);
                }else{
                    map.put(arr[i],1);
                }
            }
            int count = 0;
            for(Map.Entry<Integer,Integer> i:map.entrySet()){
                if(i.getValue()==1){
                    count++;
                    System.out.print(i.getKey());
                    if(count==1){
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}