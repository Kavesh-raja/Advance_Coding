import java.util.*;
public class Gcd {
    public static int gcd(int a, int b){
        if (b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static int euler(int n){
        int res=0;
        for (int i =1;i<n;i++){
            if(gcd(i,n)==1){
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        System.out.println(euler(num));
    }
}
