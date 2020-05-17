import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String line = sc.nextLine();
            StringBuffer sb = new StringBuffer(line);
            sb.reverse();
            String str = sb.toString();
            int sum = 0;
            for(int i = 0;i < str.length()-2;i++){
                char ch = str.charAt(i);
                if(ch>='0'&&ch<='9'){
                    sum += (ch-48)*Math.pow(16,i);
                }
                else if(ch>='A'&&ch<='Z'){
                    sum += (ch-55)*Math.pow(16,i);
                }
            }
            System.out.println(sum);
        }
    }
}

//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            String line = sc.nextLine();
//            StringBuffer sb = new StringBuffer(line);
//            sb.reverse();
//            String str = sb.toString();
//            int sum = 0;
//            for(int i = 0;i < str.length();i++){
//                char ch = str.charAt(i);
//                if(ch>='0'&&ch<='9'){
//                    sum += ((int)ch)*(int)Math.pow(16,i);
//                }else{
//                    switch(ch){
//                        case 'A':
//                            sum += 10*Math.pow(16,i);
//                            break;
//                        case 'B':
//                            sum += 11*Math.pow(16,i);
//                            break;
//                        case 'C':
//                            sum += 12*Math.pow(16,i);
//                            break;
//                        case 'D':
//                            sum += 13*Math.pow(16,i);
//                            break;
//                        case 'E':
//                            sum += 14*Math.pow(16,i);
//                            break;
//                        case 'F':
//                            sum += 15*Math.pow(16,i);
//                            break;
//                        default:
//                            break;
//                    }
//                }
//            }
//            System.out.println(sum);
//        }import java.util.*;
//        public class Main{
//            public static void main(String[] args){
//                Scanner sc = new Scanner(System.in);
//                while(sc.hasNext()){
//                    String line = sc.nextLine();
//                    StringBuffer sb = new StringBuffer(line);
//                    sb.reverse();
//                    String str = sb.toString();
//                    int sum = 0;
//                    for(int i = 0;i < str.length()-2;i++){
//                        char ch = str.charAt(i);
//                        if(ch>='0'&&ch<='9'){
//                            sum += (ch-48)*Math.pow(16,i);
//                        }
//                        else if(ch>='A'&&ch<='Z'){
//                            sum += (ch-55)*Math.pow(16,i);
//                        }
//                    }
//                    System.out.println(sum);
//                }
//            }
//        }
//    }
//}
