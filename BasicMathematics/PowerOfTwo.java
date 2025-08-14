package BasicMathematics;

public class PowerOfTwo {

    public static boolean isPowerOfTwo (int n){
        //will not work for n=0
        boolean ans=  (n & (n-1)) == 0 ? true: false;
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        isPowerOfTwo(10);
    }
}
