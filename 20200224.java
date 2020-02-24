public static void main(String[] args) {
        int[] num = {2,2,3,1};
        int ret = thirdMax(num);
        System.out.println(ret);
    }
    public static int thirdMax(int[] nums) {
        if(nums.length==0){
            return -1;
        }
        Arrays.sort(nums);
        if (nums.length < 3){
            return nums[nums.length-1];
        }
        int count=1;
        int thirdMax = nums[nums.length-1];
        for (int i=nums.length-1;i>=0;i--){
            if (count >=3) break;
            if (thirdMax != nums[i]){
                thirdMax = nums[i];
                count++;
            }
        }
        return count==3?thirdMax:nums[nums.length-1];
	}