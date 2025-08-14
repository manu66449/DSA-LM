package BasicMathematics;

public class GetSetClear {
    static void getIthBit(int n, int i) {
        if((n & (1<<i)) !=0 ) {
            System.out.println("Bit is set");
        } else {
            System.out.println("Bit is not set");
        }
    }

    static void setIthBit(int n, int i) {
        System.out.println(n | (1<<i));
    }

    static void clearIthBit(int n, int i) {
        System.out.println(n & (~(1<<i)));
    }

    public static void main(String[] args) {
        int n = 10, i=2;
        getIthBit(n, i);
        setIthBit(n, i);
        clearIthBit(n,i);
    }
}
