public class Solution {
    public int JumpFloor(int target) {
        //f(0)=0;
        if(target <= 0){
            return 0;
        }
        //f(1)=1;
        if(target == 1){
            return 1;
        }
        //f(2)=2
        if(target == 2){
            return 2;
        }
        //f(3)=3
        //f(4)=5
        //f(5)=8
        return JumpFloor(target-1)+JumpFloor(target-2);
    }
}