import java.util.*;
public class Practice {
    public static void main(String[] Args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        boolean prime[] = new boolean[num + 1];

        for (int i = 2; i <= num; i++) {
            prime[i] = true;
        }

        for (int p = 2; p*p <= num; p++) {
            if (prime[p] == true) {
                for (int j = p * p; j <= num; j = p + j) {
                    prime[j] = false;
                }
            }
        }
        for (int k = 0; k <= num; k++) {
            if (prime[k] == true) {
                System.out.println(k);
            }

        }
    }
}