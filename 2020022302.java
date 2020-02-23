public class TestMain {
    public static void main(String[] args) {
        String str = " ";
        int num=lengthOfLastWord(str);
        System.out.println(num);
    }
    public static int lengthOfLastWord(String s)throws ArrayIndexOutOfBoundsException {
        s=s.trim();
        String[] str= s.split(" ");
        char[] r=str[str.length-1].toCharArray();
        return r.length;
    }
}
