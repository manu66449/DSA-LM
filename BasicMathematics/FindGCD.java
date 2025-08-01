package BasicMathematics;

public class FindGCD {

    static int find_GCD_basic_approach(int a, int b){
        int result = Math.min(a,b);

        while(result > 0){
          if(a%result == 0 && b%result == 0){
              return result;
          }
          result --;
        }

        return result;
    }

    //based on Euclidean Algo
    static int find_GCD_optimized_approach(int a, int b){
        if(b==0)
            return a;
       return find_GCD_optimized_approach(b, a%b);
    }

    public static void main(String[] args) {
        int a=32;
        int b=46;
        System.out.println("GCD of "+ a + " and "+b+" is: " + find_GCD_optimized_approach(a,b));
    }
}
