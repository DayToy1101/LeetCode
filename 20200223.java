public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ch = sc.nextLine();
        boolean flag = canConstruct(str,ch);
        System.out.println(flag);
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
       if(magazine.length()<ransomNote.length()){
            return false;
        }
        int[] s = new int [26];
        for(char c:magazine.toCharArray()){
            s[c-'a']++;
        }
        for(char c:ransomNote.toCharArray()){
            if(s[c-'a']==0){
                return false;
            }
            s[c-'a']--;
        }
        return true;
    }
}
