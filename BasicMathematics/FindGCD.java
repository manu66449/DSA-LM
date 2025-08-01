package BasicMathematics;

public class FindGCD {

    static int find_GCD(int a, int b){
        int result = Math.min(a,b);

        while(result > 0){
          if(a%result == 0 && b%result == 0){
              return result;
          }
          result --;
        }

        return result;
    }

    public static void main(String[] args) {
        int a=32;
        int b=46;
        System.out.println("GCD of "+ a + " and "+b+" is: " + find_GCD(a,b));
    }
}
