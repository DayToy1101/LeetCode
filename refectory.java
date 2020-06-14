//牛客网---餐厅
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();//桌子数量
            int m = sc.nextInt();//顾客批数
            int[] desks = new int[n];//每个桌子所容纳的最大顾客人数
            for(int i = 0 ;i < n;i++){
                desks[i] = sc.nextInt();
            }
            Arrays.sort(desks);
            PriorityQueue<Person> q = new PriorityQueue<>();
            for(int i = 0;i < m;i++){
                int num = sc.nextInt();
                int money = sc.nextInt();
                if(num <= desks[n-1]){
                    q.add(new Person(num,money));
                }
            }
            boolean[] flag = new boolean[n];//用来判断第i桌是否有客人
            int ret = 0;
            int count = 0;
            while(!q.isEmpty()){
                Person p = q.poll();
                for(int i = 0;i < n;i++){
                    if(p.num <= desks[i]&&!flag[i]){
                        ret += p.money;
                        count++;
                        flag[i] = true;
                        break;
                    }
                }
                if(count == n){
                    break;
                }
            }
            System.out.println(ret);
        }
    }
    private static class Person implements Comparable<Person>{
        private int num;
        private int money;
        public Person(int num,int money){
            this.num = num;
            this.money = money;
        }
        public int compareTo(Person o){
            if(this.money > o.money){
                return -1;
            }else if(this.money < o.money){
                return 1;
            }else{
                return 0;
            }
        }
    }
}