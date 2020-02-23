public static void main(String[] args) {
        String str1 = "vtkgn";
        String str2 = "vttkgnn";
        boolean flag = isLongPressedName(str1,str2);
        System.out.println(flag);
    }
    public static boolean isLongPressedName(String name, String typed) {
        if (typed.length() < name.length()) {
            return false;
        }
        int j = 0;
        for(int i = 0;i<typed.length();i++){
            if(name.charAt(j)==typed.charAt(i)){
                j++;
            }
            if(j==name.length()){
                break;
            }
        }
        return j==name.length()?true:false;
    }