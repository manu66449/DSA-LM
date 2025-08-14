package BasicMathematics;

//LCM (Least Common Multiple): The smallest number that is a multiple of both a and b.
//For example, the LCM of 12 and 18 is 36. The multiples of 12 are 12, 24, 36, 48... and the multiples of 18 are 18, 36, 54... The smallest number they share is 36.

public class FindLCM {

     static int findLCM(int a, int b) {
        // Start with the larger of the two numbers.
        int max = Math.max(a, b);

        // Keep multiplying 'max' by an integer 'i' until the result is divisible by both 'a' and 'b'.
        for (int i = 1; ; i++) {
            int currentMultiple = max * i;
            if (currentMultiple % a == 0 && currentMultiple % b == 0) {
                return currentMultiple;
            }
        }
    }

    //based on Euclidean Algo
    static int findGCD(int a, int b){
        if(b==0)
            return a;
        return findGCD(b, a%b);
    }

    static int findLCM_optimized(int a, int b){
        return (a * b)/findGCD(a,b);
    }

    public static void main(String[] args) {
        int a=12;
        int b=9;
        System.out.println("GCD of "+ a + " and "+b+" is: " + findLCM(a,b));
    }
}
