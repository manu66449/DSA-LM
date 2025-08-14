package BasicMathematics;

import java.util.Arrays;

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

    static void allPrimeLessThanN(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        for (int i = 2; i < Math.sqrt(n); i++) {

            //iterate inner loop for prime number, because for
            // all the other non-prime numbers, prev number must marked it divisible number as non-prime
            if (prime[i]) {
                //mark all the other divisible numbers as non-prime
                for (int j = i * i; j <= n; j = j + i) {
                    prime[j] = false;
                }
            }
        }

        for(int i=2;i<=n;i++) {
            if(prime[i]) {
                System.out.println("This is prime " + i);
            }
        }
    }


        public static void main(String[] args) {
        int n=11;
        System.out.println(Math.sqrt(50));
        System.out.println("No. is prime:  " + find_prime_optimized_approach(n));
    }
}
