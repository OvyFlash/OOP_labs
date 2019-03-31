import java.util.concurrent.ExecutionException;

public class lab_1 {
    public static void main(String[] args) {
        long a = 1;
        long b = 1;
        int m = 10;
        int n = 10;
        int C = 0;
        float S = 0;
        if (((b < 0)&(m>0)) | (a == -C)) {
            System.out.printf("You can use %d as b because of the possibility DivisionByZero error\n", b);
        } else {
            try {
                for (long i = a; i <= n; i++) {
                    for (long j = b; j <= m; j++) {
                        S += ((double) i / j) / (i + C);
                    }
                }
                System.out.println(S);
            } catch(ArithmeticException e) {
                System.out.println("Sorry, something went wrong");
            }
        }

    }
}
