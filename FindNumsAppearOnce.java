//num1,num2分别为长度为1的数组。传出参数

//将num1[0],num2[0]设置为返回结果
import java.util.Stack;
import java.util.Arrays;
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        Arrays.sort(array);
        Stack<Integer> s = new Stack<>();
        for(int i = 0;i<array.length;i++){
            if(s.empty()||s.peek()!=array[i]){
                s.push(array[i]);
            }
            else if(s.peek()==array[i]){
                s.pop();
            }
        }
        num1[0] = s.pop();
        num2[0] = s.pop();
    }
}