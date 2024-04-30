package JavaQ_8_9_10;
//Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
public class FibonacciNumber9 {
    public static void main(String[] args) {
        int n = 8;
        // Initialize first two Fibonacci number
        int a = 1;
        int b = 1;
        System.out.println(a + " " + b + " ");
        for (int x =3; x<=n; x++){
            int c = a + b;
            System.out.println(c + " ");
            a = b;
            b = c;
        }
    }
}
