 public static void main(String[] args) {
        int[] num = {9};
        int[] ret = plusOne(num);
        for(int i =0 ;i< ret.length;i++){
            System.out.println(ret[i]);
        }
    }
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length-1;i>=0;i--){
            digits[i] += 1;
            digits[i] %= 10;
            //判断是否有进位
			if(digits[i]!=0){
                return digits;
            }
        }
        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;
    }