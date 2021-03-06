public class TwoSearch {
    public static void main(String[] args) {
        int[] arrs = {1, 3, 5, 6};
        int ret = searchInsert(arrs, 5);
        System.out.println(ret);
	}
	 public static int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(target<nums[mid]){
                right=mid-1;
                //right--;
            }else if(target>nums[mid]){
                left=mid+1;
                //left++;
            }else if(target==nums[mid]){
                return mid;
            }
        }
        return left;
    }
}