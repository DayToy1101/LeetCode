public static void main(String[] args) {
        String str = "abc";
        String arr = "a*e";
        boolean ret = isMatch(str,arr);
        System.out.println(ret);
    }
    public static boolean isMatch(String s, String p){
       if(p==null && s==null){
           return true;
       }
       else if(p==null&&s!=null){
           return false;
       }
       int i = 0;
       int j = 0;
       int s1=-1;
       int p1=-1;
       while(i<s.length()){
           if(j<p.length()&&(s.charAt(i)==p.charAt(j)||p.charAt(j)=='?')){
               i++;
               j++;
           }else if(j<p.length()&&p.charAt(j)=='*'){
               s1=i;
               p1=j++;
           }else if(s1>-1){
               i=++s1;
               j=p1+1;
           }else{
               return false;
           }
       }
       while(j<p.length()&&p.charAt(j)=='*'){
           j++;
       }
       return j==p.length();
    }