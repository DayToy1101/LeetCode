class Solution {
    public int[] smallestK(int[] arr, int k) {
        if(arr==null||k<=0){
            return new int[0];
        }
        PriorityQueue<Integer> p = new PriorityQueue<>(arr.length);
        //1、将arr中的数据放到优先级队列中
        for(int i = 0;i<arr.length;i++){
            p.offer(arr[i]);
        }
        //2、依次取优先级队列中的前K个元素
        int[] ret = new int[k];
        for(int i = 0;i<k;i++){
            ret[i]=p.peek();
            p.poll();
        }
        return ret;
    }
}