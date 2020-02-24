 public static void main(String[] args) {
        String m="11";
        String n="1";
        String num=addBinary(m,n);
        System.out.println(num);
    }
    public static String addBinary(String a, String b) {
        StringBuilder ret = new StringBuilder();
        int lena=a.length()-1;
        int lenb=b.length()-1;
        int sum = 0;
        int count = 0;//记录是否有进位
        while(lena>=0||lenb>=0){
            sum=count;
            if(lena>=0){
                sum+=(a.charAt(lena)-'0');
                lena--;
            }
            if(lenb>=0){
                sum+=(b.charAt(lenb)-'0');
                lenb--;
            }
            ret.append(sum%2);
            count=sum/2;
        }
        if(count!=0){
            ret.append(1);
        }
        return ret.reverse().toString();
    }