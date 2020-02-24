public static void main(String[] args) {
        int[] sum = {2,7,11,15};
        int[] ret = twoSum(sum,9);
        if(ret!=null) {
            for(int i = 0 ;i<ret.length;i++){
                System.out.println(ret[i]);
            }
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] index=null;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    index=new int[2];
                    index[0]=i;
                    index[1]=j;
                    break;
                }
            }
        }
        return index;
    }