package BasicMathematics;

public class FindPrime {

//    TC: O(sqrt(n))
//    To optimize it further, we can ignore even numbers since they'll be divisble by 2
    static boolean find_prime_optimized_approach(int n){
       for(int i=2; i<Math.sqrt(n);i++){
           if(n%i == 0){
              return false;
           }
       }
       return true;
    }

    public static void main(String[] args) {
        int n=11;
        System.out.println(Math.sqrt(50));
        System.out.println("No. is prime:  " + find_prime_optimized_approach(n));
    }
}
