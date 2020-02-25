public static void main(String[] args) {
        int[] num={-4,-1,0,3,10};
        int[] ret = sortedSquares(num);
        for(int i = 0;i<ret.length;i++){
            System.out.println(ret[i]);
        }
    }
    public static int[] sortedSquares(int[] A) {
        for(int i = 0;i<A.length;i++){
            A[i]*=A[i];
        }
        for(int i =0;i<A.length;i++){
            for(int j = i+1;j<A.length;j++){
                if(A[j]<A[i]) {
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
            }
        }
        return A;
    }