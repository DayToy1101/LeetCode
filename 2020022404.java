public static void main(String[] args) {
        int[] sum={1};
        int[] ret=searchRange(sum,1);
        for(int i =0;i<ret.length;i++){
            System.out.println(ret[i]);
        }
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] index={-1,-1};
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i]==target){
                index[0]=i;
                break;
            }
        }
        if(index[0]==-1){
            return index;
        }
        for(int j = nums.length-1;j>=0;j--){
            if(nums[j]==target){
                index[1]=j;
                break;
            }
        }
        return index;
    }