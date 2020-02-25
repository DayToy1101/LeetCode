    public static void main(String[] args) {
        String str = "ab-cd";
        String ret = reverseOnlyLetters(str);
        System.out.println(ret);
    }
    public static String reverseOnlyLetters(String S) {
        if(S==null||S.length()<2){
            return S;
        }
        char[] ch = S.toCharArray();
        int left = 0;
        int right = ch.length-1;
        while(left<right){
            if(Character.isLetter(ch[left])&&Character.isLetter(ch[right])){
                char tmp = ch[left];
                ch[left]=ch[right];
                ch[right]=tmp;
                left++;
                right--;
            }else if(Character.isLetter(ch[left])){
                right--;
            }else if(Character.isLetter(ch[right])){
                left++;
            }else{
                right--;
                left++;
            }
        }
        return String.valueOf(ch);
    }